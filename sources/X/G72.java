package X;

import com.ss.android.ugc.aweme.kids.choosemusic.fragment.HotMusicListFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public final /* synthetic */ class G72 implements VCV, InterfaceC45906Hzy, InterfaceC85026XYo, InterfaceC30795C6t {
    public final /* synthetic */ Object LJLIL;

    @Override // X.InterfaceC85026XYo
    public void LIZ() {
        ((HotMusicListFragment) this.LJLIL).LJIIJJI();
    }

    public /* synthetic */ G72(Object obj) {
        this.LJLIL = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [R, java.lang.Object] */
    @Override // X.VCV
    public VCY LIZIZ(VCY vcy) {
        Class cls = (Class) this.LJLIL;
        try {
            vcy.LIZ = cls.newInstance();
            return vcy;
        } catch (IllegalAccessException unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Requested class isn't registered in LiveImplProvider and its nullary constructor isn't accessible: ");
            LIZ.append(cls.getName());
            LIZ.append(".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        } catch (InstantiationException unused2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Requested class isn't registered in LiveImplProvider and doesn't have public non-param constructor: ");
            LIZ2.append(cls.getName());
            LIZ2.append(".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
            throw new RuntimeException(X1D.LIZIZ(LIZ2));
        }
    }

    @Override // X.InterfaceC30795C6t
    public void LIZJ(int i) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) this.LJLIL;
        if (i == 4) {
            videoPublishContainerScene.LLILZLL.creativeModel.privacySettingModel.isSubscribeOnly = true;
            videoPublishContainerScene.LLJLILLLLZIIL.LJ();
        } else {
            VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
            videoPublishEditModel.isPrivate = i;
            videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly = false;
        }
        C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
        VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene.LLILZLL;
        G9M.LJ(videoPublishEditModel2, "video_post_page", i, videoPublishEditModel2.creativeModel.transientPostPageModel.LJJJI, null);
        videoPublishContainerScene.LLIIII.setValue(new G6D(i));
        if (videoPublishContainerScene.LLLF()) {
            C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
            G9E.LIZ(videoPublishContainerScene.requireActivity(), i);
        }
        C40992G6y c40992G6y = videoPublishContainerScene.LLF;
        if (c40992G6y != null) {
            c40992G6y.LJ(i, C40987G6t.LIZ.getBoolean("key_auto_caption_manual_operation", C52250Kf0.LIZIZ()), false);
        }
        videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJIIIZ = true;
    }
}
