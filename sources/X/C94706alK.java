package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.alK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94706alK extends AbstractC65781Prl implements InterfaceC88472Yns<FrameLayout, C76800UCe> {
    public final /* synthetic */ AKT LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Fragment LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94706alK(AKT akt, String str, Fragment fragment, boolean z, String str2) {
        super(1);
        this.LJLIL = akt;
        this.LJLILLLLZI = str;
        this.LJLJI = fragment;
        this.LJLJJI = z;
        this.LJLJJL = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FrameLayout it) {
        o.LJIIIZ(it, "it");
        TypedArray obtainStyledAttributes = it.getContext().obtainStyledAttributes(null, new int[]{R.attr.mc, R.attr.md, R.attr.me, R.attr.mf, R.attr.mg, R.attr.mh, R.attr.mi, R.attr.mj, R.attr.mk, R.attr.ml, R.attr.p5}, R.attr.jn, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "it.context.obtainStyledA…     0,\n                )");
        int i = obtainStyledAttributes.getInt(7, 0);
        obtainStyledAttributes.recycle();
        T5R t5r = new T5R(it.getContext().getString(R.string.ba6));
        t5r.LIZ(i);
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextColor(-1);
        tuxTextView.setTuxFont(i);
        tuxTextView.setText(t5r);
        it.addView(tuxTextView);
        C16880lQ.LJJJJI(tuxTextView, new ViewOnClickListenerC93959aZH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL));
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(FrameLayout frameLayout) {
        invoke2(frameLayout);
        return C76800UCe.LIZ;
    }
}
