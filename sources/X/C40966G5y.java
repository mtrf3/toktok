package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.G5y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40966G5y extends GF4 {
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ VideoPublishContainerScene LIZJ;

    @Override // X.GF9, X.InterfaceC42491Glz, X.GGH, X.GF3
    public final VideoPublishEditModel LIZLLL() {
        return this.LIZJ.LLILZLL;
    }

    @Override // X.GGH
    public final List<AVTextExtraStruct> LJI() {
        return this.LIZJ.LLIIIJ.LJ();
    }

    @Override // X.GGH
    public final boolean LJIIJ() {
        return this.LIZJ.LLILZLL.creativeModel.transientPostPageModel.LJJIIZI;
    }

    @Override // X.InterfaceC42491Glz
    public final boolean LJIILIIL() {
        return this.LIZJ.LLILZLL.creativeModel.transientPostPageModel.LJIIJ;
    }

    @Override // X.GF7
    public final InterfaceC78933UyP LJIILLIIL() {
        return (InterfaceC78933UyP) this.LIZJ.requireParentScene();
    }

    @Override // X.GF9
    public final String getUid() {
        final int i = 1;
        return (String) AbstractC65743Pr9.fromNullable(C44172HVg.LJIJ.getCurrentUser()).transform(new InterfaceC65644PpY() { // from class: X.G8c
            @Override // X.InterfaceC65644PpY
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(obj instanceof AbstractStickerFragment);
                    default:
                        return ((InterfaceC45930I0w) obj).getUid();
                }
            }
        }).or((AbstractC65743Pr9) CardStruct.IStatusCode.DEFAULT);
    }

    @Override // X.InterfaceC41452GOq
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        VideoPublishContainerScene videoPublishContainerScene = this.LIZJ;
        return C165706es.LIZIZ(videoPublishContainerScene.LLJLL(), videoPublishContainerScene);
    }

    @Override // X.InterfaceC42491Glz, X.GGH
    public final Fragment getFragment() {
        return this.LIZIZ;
    }

    @Override // X.GF7
    public final WM7 getScene() {
        return this.LIZJ;
    }

    @Override // X.GGH
    public final void LJ(boolean z) {
        View findViewById;
        TextView textView;
        VideoPublishContainerScene videoPublishContainerScene = this.LIZJ;
        Boolean valueOf = Boolean.valueOf(z);
        View findViewById2 = videoPublishContainerScene.LLJJJJ.findViewById(R.id.ifn);
        if (findViewById2 == null || (findViewById = videoPublishContainerScene.LLJJJJ.findViewById(R.id.ifo)) == null || (textView = videoPublishContainerScene.LLJZIJLIL) == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (valueOf.booleanValue()) {
            TCMPostPageSubmitTextModel submitText = videoPublishContainerScene.LLILZLL.creativeModel.commerceModel.getTcmModel().getSubmitText();
            if (submitText == null) {
                return;
            }
            if (!TextUtils.isEmpty(submitText.getSubmitTitleText())) {
                videoPublishContainerScene.LLJZIJLIL.setText(submitText.getSubmitTitleText());
            }
            if (TextUtils.isEmpty(submitText.getSubmitButtonText())) {
                return;
            }
            ((TextView) videoPublishContainerScene.LLJJJJ.findViewById(R.id.ifx)).setText(submitText.getSubmitButtonText());
            findViewById2.setVisibility(8);
            findViewById.setVisibility(0);
            return;
        }
        findViewById2.setVisibility(0);
        findViewById.setVisibility(8);
        videoPublishContainerScene.LLJZIJLIL.setText(text);
    }

    @Override // X.GGH
    public final void LJII(boolean z) {
        VideoPublishContainerScene videoPublishContainerScene;
        G5K g5k;
        G6D value = this.LIZJ.LLIIII.getValue();
        if (value == null || (g5k = (videoPublishContainerScene = this.LIZJ).LLIIIILZ) == null) {
            return;
        }
        if (z) {
            videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIJIIJI = true;
            if (value.getPermission() == 1) {
                this.LIZJ.LLIIII.setValue(new G6D(0));
                value = this.LIZJ.LLIIII.getValue();
                if (getContext() != null) {
                    Fragment fragment = this.LIZIZ;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(getContext().getString(R.string.tm5));
                    C78915Uy7.LJJIJIIJI(fragment, 2006, creativeToastBuilder);
                }
            }
            this.LIZJ.LLIIIILZ.LIZIZ(null, value.getPermission(), 0, true);
            return;
        }
        videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIJIIJI = false;
        g5k.LIZIZ(null, value.getPermission(), 0, false);
    }

    @Override // X.GF4, X.InterfaceC41449GOn
    public final void LJIIJJI(InterfaceC40967G5z interfaceC40967G5z) {
        VideoPublishContainerScene videoPublishContainerScene = this.LIZJ;
        if (videoPublishContainerScene.LJLJL == null) {
            videoPublishContainerScene.LJLJL = new ArrayList();
        }
        if (!((ArrayList) this.LIZJ.LJLJL).contains(interfaceC40967G5z)) {
            VideoPublishContainerScene videoPublishContainerScene2 = this.LIZJ;
            interfaceC40967G5z.onViewCreated(videoPublishContainerScene2.mView, videoPublishContainerScene2.LLIZLLLIL);
            ((ArrayList) this.LIZJ.LJLJL).add(interfaceC40967G5z);
        }
    }

    @Override // X.GGH
    public final void LJIIL(boolean z) {
        VideoPublishContainerScene videoPublishContainerScene;
        G5K g5k;
        G6D value = this.LIZJ.LLIIII.getValue();
        if (value != null && (g5k = (videoPublishContainerScene = this.LIZJ).LLIIIILZ) != null) {
            videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIJIIJI = z;
            g5k.LIZIZ(null, value.getPermission(), 0, this.LIZJ.LLILZLL.creativeModel.transientPostPageModel.LJJIJIIJI);
        }
    }

    @Override // X.GGH
    public final void LJIILL(boolean z) {
        C40984G6q c40984G6q;
        AIF aif;
        AIF aif2;
        VideoPublishContainerScene videoPublishContainerScene = this.LIZJ;
        if (videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIIZI && (c40984G6q = videoPublishContainerScene.LLILZ) != null) {
            AI9 ai9 = null;
            if (z) {
                c40984G6q.LJIJ = "";
                AI8 ai8 = c40984G6q.LJIILJJIL;
                if (ai8 != null) {
                    ai9 = ai8.getAccessory();
                }
                if ((ai9 instanceof AIF) && (aif2 = (AIF) ai9) != null) {
                    aif2.LJIILIIL(c40984G6q.LJIJ);
                }
                Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
                AI8 ai82 = c40984G6q.LJIILJJIL;
                if (ai82 == null) {
                    return;
                }
                ai82.setShowAlertBadge(false);
                return;
            }
            c40984G6q.LJIJ = "";
            AI8 ai83 = c40984G6q.LJIILJJIL;
            if (ai83 != null) {
                ai9 = ai83.getAccessory();
            }
            if (!(ai9 instanceof AIF) || (aif = (AIF) ai9) == null) {
                return;
            }
            aif.LJIILIIL(c40984G6q.LJIJ);
        }
    }

    public C40966G5y(VideoPublishContainerScene videoPublishContainerScene, TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment) {
        this.LIZJ = videoPublishContainerScene;
        this.LIZIZ = tikTokPublishGroupSceneFragment;
    }
}
