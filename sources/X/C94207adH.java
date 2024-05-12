package X;

import android.content.Context;
import android.view.View;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.adH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94207adH implements InterfaceC93663aUV<String> {
    public final long LIZ;
    public final C94456ahI LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final /* synthetic */ C94457ahJ LJ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        C94457ahJ c94457ahJ = this.LJ;
        String str = this.LIZJ;
        c94457ahJ.getClass();
        C94457ahJ.LJLZ(false, null, str);
        C94457ahJ c94457ahJ2 = this.LJ;
        c94457ahJ2.LJLLLLLL(ListProtector.get(c94457ahJ2.LJLIL, this.LIZLLL), EnumC93674aUg.Retry);
        ToastService toastService = ToastService.INSTANCE;
        View view = this.LIZIZ.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        View view2 = this.LIZIZ.itemView;
        o.LJIIIIZZ(view2, "holder.itemView");
        String string = view2.getContext().getString(R.string.fx4);
        o.LJIIIIZZ(string, "holder.itemView.context.…ection1\n                )");
        toastService.showToast(context, string);
    }

    @Override // X.InterfaceC93663aUV
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(String result) {
        o.LJIIIZ(result, "result");
        C94457ahJ c94457ahJ = this.LJ;
        String str = this.LIZJ;
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.LIZ);
        c94457ahJ.getClass();
        C94457ahJ.LJLZ(true, valueOf, str);
        C94457ahJ c94457ahJ2 = this.LJ;
        c94457ahJ2.LJLLLLLL(ListProtector.get(c94457ahJ2.LJLIL, this.LIZLLL), EnumC93674aUg.Normal);
        C94457ahJ c94457ahJ3 = this.LJ;
        String str2 = this.LIZJ;
        int i = this.LIZLLL;
        if (i == c94457ahJ3.LJLJI) {
            c94457ahJ3.LJLJI = -1;
            C93750aVu.LIZ.removeCallbacksAndMessages(null);
            C93750aVu.LIZIZ.set(true);
            C93750aVu.LIZJ.clear();
            c94457ahJ3.LJLJJI.U0(new C94398agM(((AssetsLibData.AssetsItemData) ListProtector.get(c94457ahJ3.LJLIL, i)).name, result, str2));
        }
    }

    public C94207adH(C94457ahJ c94457ahJ, C94456ahI holder, String effectId, int i) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effectId, "effectId");
        this.LJ = c94457ahJ;
        this.LIZIZ = holder;
        this.LIZJ = effectId;
        this.LIZLLL = i;
        this.LIZ = System.currentTimeMillis();
    }
}
