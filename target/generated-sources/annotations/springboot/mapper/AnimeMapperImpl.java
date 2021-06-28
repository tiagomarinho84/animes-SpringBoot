package springboot.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import springboot.domain.Anime;
import springboot.domain.Anime.AnimeBuilder;
import springboot.requests.AnimePostRequestBody;
import springboot.requests.AnimePutRequestBody;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-28T02:07:15-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.8 (Oracle Corporation)"
)
@Component
public class AnimeMapperImpl extends AnimeMapper {

    @Override
    public Anime toAnime(AnimePostRequestBody animePostRequestBody) {
        if ( animePostRequestBody == null ) {
            return null;
        }

        AnimeBuilder anime = Anime.builder();

        anime.name( animePostRequestBody.getName() );

        return anime.build();
    }

    @Override
    public Anime toAnime(AnimePutRequestBody animePutRequestBody) {
        if ( animePutRequestBody == null ) {
            return null;
        }

        AnimeBuilder anime = Anime.builder();

        anime.id( animePutRequestBody.getId() );
        anime.name( animePutRequestBody.getName() );

        return anime.build();
    }
}
