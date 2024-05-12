package X;

import com.ss.android.ugc.aweme.profile.effect.EffectProfileListFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SoX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73225SoX implements InterfaceC73307Spr {
    public final /* synthetic */ EffectProfileListFragment LIZ;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        ((C223338pd) this.LIZ._$_findCachedViewById(R.id.kfk)).LIZJ();
        ((C223338pd) this.LIZ._$_findCachedViewById(R.id.kfk)).setVisibility(8);
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        ((C223338pd) this.LIZ._$_findCachedViewById(R.id.kfk)).LIZIZ();
        ((C223338pd) this.LIZ._$_findCachedViewById(R.id.kfk)).setVisibility(0);
    }

    public C73225SoX(EffectProfileListFragment effectProfileListFragment) {
        this.LIZ = effectProfileListFragment;
    }
}
