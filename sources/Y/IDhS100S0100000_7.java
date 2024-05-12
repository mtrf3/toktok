package Y;

import X.AbstractC65743Pr9;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C152345yQ;
import X.C41049G9d;
import X.C41085GAn;
import X.C41658GWo;
import X.C41723GZb;
import X.C42557Gn3;
import X.C43464H4a;
import X.C44497HdF;
import X.C44888HjY;
import X.C68322mC;
import X.C82135WLj;
import X.C87677Yb3;
import X.C87678Yb4;
import X.InterfaceC48038ItG;
import X.OSZ;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDhS100S0100000_7 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case 9:
                return apply$9(this, obj);
            case 10:
                return apply$10(this, obj);
            default:
                return null;
        }
    }

    public IDhS100S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS100S0100000_7 iDhS100S0100000_7, Object it) {
        o.LJIIIZ(it, "it");
        return AbstractC65743Pr9.fromNullable(VEUtils.getVideoFileInfo(((VideoPublishEditModel) iDhS100S0100000_7.l0).videoPath()));
    }

    public static final Object apply$1(IDhS100S0100000_7 iDhS100S0100000_7, Object it) {
        o.LJIIIZ(it, "it");
        return AbstractC65743Pr9.fromNullable(VEUtils.getVideoFileInfo(((VideoPublishEditModel) iDhS100S0100000_7.l0).videoPath()));
    }

    public static final Object apply$10(IDhS100S0100000_7 iDhS100S0100000_7, Object obj) {
        C41723GZb it = (C41723GZb) obj;
        o.LJIIIZ(it, "it");
        return ((C42557Gn3) iDhS100S0100000_7.l0).LJI(it);
    }

    public static final Object apply$2(IDhS100S0100000_7 iDhS100S0100000_7, Object obj) {
        Boolean isNeedShow = (Boolean) obj;
        o.LJIIIZ(isNeedShow, "isNeedShow");
        boolean z = true;
        if (!C41658GWo.LIZLLL().LJ.booleanValue() && C43464H4a.LIZ() && C152345yQ.LIZ() > 60000 && C152345yQ.LIZ() <= 180000 && isNeedShow.booleanValue()) {
            ViewStub viewStub = ((MvChoosePhotoScene) iDhS100S0100000_7.l0).LLILLJJLI;
            if (viewStub != null && viewStub.getParent() != null && viewStub != null) {
                viewStub.inflate();
            }
            MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) iDhS100S0100000_7.l0;
            mvChoosePhotoScene.LLILLIZIL = (C82135WLj) mvChoosePhotoScene.findViewById(R.id.h43);
            C82135WLj c82135WLj = ((MvChoosePhotoScene) iDhS100S0100000_7.l0).LLILLIZIL;
            if (c82135WLj != null) {
                c82135WLj.setVisibility(0);
            }
            int LIZ = (int) (C152345yQ.LIZ() / 60000);
            MvChoosePhotoScene mvChoosePhotoScene2 = (MvChoosePhotoScene) iDhS100S0100000_7.l0;
            C82135WLj c82135WLj2 = mvChoosePhotoScene2.LLILLIZIL;
            if (c82135WLj2 != null) {
                String string = mvChoosePhotoScene2.getResources().getString(R.string.thg, Integer.valueOf(LIZ));
                o.LJIIIIZZ(string, "resources.getString(R.st…l_60s_copy, maxVideoTime)");
                c82135WLj2.setTitleContent(string);
            }
            MvChoosePhotoScene mvChoosePhotoScene3 = (MvChoosePhotoScene) iDhS100S0100000_7.l0;
            C82135WLj c82135WLj3 = mvChoosePhotoScene3.LLILLIZIL;
            if (c82135WLj3 != null) {
                c82135WLj3.setOnCloseClickListener(new AqS157S0100000_7(mvChoosePhotoScene3, 475));
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object apply$3(IDhS100S0100000_7 iDhS100S0100000_7, Object obj) {
        OSZ osz = (OSZ) obj;
        o.LJIIIZ(osz, "<name for destructuring parameter 0>");
        String imagePath = (String) osz.getFirst();
        String musicPath = (String) osz.getSecond();
        o.LJIIIIZZ(imagePath, "imagePath");
        o.LJIIIIZZ(musicPath, "musicPath");
        return AbstractC73638SvC.LJI(new C44888HjY(imagePath, musicPath, (Aweme) iDhS100S0100000_7.l0));
    }

    public static final Object apply$4(IDhS100S0100000_7 iDhS100S0100000_7, Object obj) {
        String videoPath = (String) obj;
        o.LJIIIZ(videoPath, "videoPath");
        return AbstractC73638SvC.LJI(new C44497HdF((Aweme) iDhS100S0100000_7.l0, videoPath));
    }

    public static final Object apply$5(IDhS100S0100000_7 iDhS100S0100000_7, Object obj) {
        UploadAuthKeyConfig config = (UploadAuthKeyConfig) obj;
        o.LJIIIZ(config, "config");
        return AbstractC73672Svk.LJIIJ(new IDuS78S0200000_7(config, (C87677Yb3) iDhS100S0100000_7.l0, 3));
    }

    public static final Object apply$6(IDhS100S0100000_7 iDhS100S0100000_7, Object obj) {
        UploadAuthKeyConfig config = (UploadAuthKeyConfig) obj;
        o.LJIIIZ(config, "config");
        return AbstractC73672Svk.LJIIJ(new IDuS78S0200000_7(config, (C87678Yb4) iDhS100S0100000_7.l0, 4));
    }

    public static final Object apply$7(IDhS100S0100000_7 iDhS100S0100000_7, Object obj) {
        String musicId = (String) obj;
        o.LJIIIZ(musicId, "musicId");
        return ((RecommendMusicApi) iDhS100S0100000_7.l0).getMusicDetail(musicId);
    }

    public static final Object apply$8(IDhS100S0100000_7 iDhS100S0100000_7, Object it) {
        o.LJIIIZ(it, "it");
        List<TranslatedRegion> list = ((C41085GAn) iDhS100S0100000_7.l0).LJLIL;
        ArrayList arrayList = new ArrayList();
        for (TranslatedRegion translatedRegion : list) {
            if (translatedRegion.getSelected()) {
                arrayList.add(translatedRegion);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$9(IDhS100S0100000_7 iDhS100S0100000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((C68322mC) iDhS100S0100000_7.l0).element = it;
        return C41049G9d.LIZ();
    }
}
