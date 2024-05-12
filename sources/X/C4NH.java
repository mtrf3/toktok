package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4NH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NH extends C4NG {
    public static final /* synthetic */ int LLILLIZIL = 0;
    public final Activity LLIILZL;
    public final java.util.Set<IMContact> LLIIZ;
    public final java.util.Map<String, String> LLIL;
    public final java.util.Map<String, String> LLILII;
    public boolean LLILIL;
    public final C62822Ol8 LLILL;

    @Override // X.C4NG
    public final void LJJIIJ() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout LJJI = LJJI();
        if (LJJI == null || (layoutParams = LJJI.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = O6R.LJJIIZ(C60996Nwm.LJ(getContext()) * 0.73f);
    }

    @Override // X.C4NG, X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        super.dismiss();
        View LJJIFFI = LJJIFFI();
        if (LJJIFFI != null && (viewTreeObserver = LJJIFFI.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.LLILL.getValue());
        }
    }

    @Override // X.C4NG
    public final void LJJIIJZLJL(boolean z) {
        View view = this.LLI;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.C4NG, X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        super.onCreate(bundle);
        View LJJIFFI = LJJIFFI();
        if (LJJIFFI != null && (viewTreeObserver = LJJIFFI.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.LLILL.getValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4NH(Activity activity, OQY oqy, C4NQ c4nq, SharePackage initSharePackage, BaseContent baseContent, java.util.Map map, java.util.Map map2, boolean z, boolean z2) {
        super(activity, oqy, false, c4nq, false, initSharePackage, baseContent, map, map2, null, null, false, false, z, z2, false, 79380);
        o.LJIIIZ(initSharePackage, "initSharePackage");
        this.LLIILZL = activity;
        this.LLIIZ = oqy;
        this.LLIL = map;
        this.LLILII = map2;
        this.LLILL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 788));
    }
}
