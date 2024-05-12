package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJR extends JJZ {
    public final EnumC48951JJb LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public Double LJFF;
    public Integer LJI;
    public Integer LJII;
    public IQ9 LJIIIIZZ;

    public final Aweme LIZIZ() {
        Video video = new Video();
        VideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
        localVideoUrlModel.setSourceId(this.LIZIZ);
        localVideoUrlModel.setUri(this.LIZJ);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LIZJ);
        arrayList.add(this.LIZLLL);
        localVideoUrlModel.setUrlList(arrayList);
        localVideoUrlModel.setUrlKey(this.LIZIZ);
        video.setPlayAddr(localVideoUrlModel);
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(this.LJ);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.LJ);
        urlModel.setUrlList(arrayList2);
        video.setCover(urlModel);
        Integer num = this.LJI;
        if (num != null) {
            video.setWidth(num.intValue());
        }
        Integer num2 = this.LJII;
        if (num2 != null) {
            video.setHeight(num2.intValue());
        }
        Double d = this.LJFF;
        if (d != null) {
            video.setVideoLength((int) d.doubleValue());
        }
        video.setPlayAddrBytevc1(video.getPlayAddr());
        Aweme aweme = new Aweme();
        aweme.setVideo(video);
        aweme.setAid(this.LIZIZ);
        return aweme;
    }

    @Override // X.JJZ
    public final EnumC48951JJb LIZ() {
        return this.LIZ;
    }

    public KJR(EnumC48951JJb type) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
    }
}
