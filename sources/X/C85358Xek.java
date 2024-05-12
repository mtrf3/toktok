package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import kotlin.jvm.internal.o;

/* renamed from: X.Xek, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85358Xek extends AbstractC85354Xeg {
    @Override // X.AbstractC85354Xeg
    public final String LIZIZ() {
        return "video_post_page";
    }

    @Override // X.AbstractC85354Xeg
    public final void LJFF() {
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJI() {
        String str;
        boolean z;
        boolean z2;
        InterfaceC40948G5g publishExtensionDataContainer = this.LJLJI.LJLILLLLZI.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = ((VideoPublishContainerScene) publishExtensionDataContainer).LLLLJ();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        if (fromString != null && fromString.poiData != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLJI.LJLJI != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC85354Xeg
    public final String LIZJ() {
        if (LIZLLL().getState().LJLILLLLZI != null) {
            return "click_poi";
        }
        return "click_add_location";
    }

    @Override // X.AbstractC85354Xeg
    public final void LJII() {
        LJIIIIZZ(LJI() ? 1 : 0);
        LIZLLL().LJLIL = "poi_sticker";
        LIZLLL().jv0(this.LJLJI.LJLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85358Xek(Context sceneContext, LifecycleOwner lifecycleOwner, C85359Xel extensionMiscData) {
        super(sceneContext, lifecycleOwner, extensionMiscData);
        o.LJIIIZ(sceneContext, "sceneContext");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(extensionMiscData, "extensionMiscData");
    }
}
