package springboot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import springboot.domain.Anime;
import springboot.requests.AnimePostRequestBody;
import springboot.requests.AnimePutRequestBody;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {

    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
