package X;

import Y.ACListenerS21S0100000_1;
import Y.IDObjectS174S0100000_1;
import Y.IDTListenerS111S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4NJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NJ extends LinearLayout {
    public final View LJLIL;
    public final EditText LJLILLLLZI;
    public final ImageView LJLJI;
    public ShareDialogViewModel LJLJJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;

    public final void setEditClickCallBack(InterfaceC65784Pro<C76800UCe> click) {
        o.LJIIIZ(click, "click");
        this.LJLJJL = click;
    }

    public final void setListViewModel(ShareDialogViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLJJI = viewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4NJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        View inflate = View.inflate(context, R.layout.b9_, this);
        o.LJIIIIZZ(inflate, "inflate(context, R.layou…layout_search_head, this)");
        this.LJLIL = inflate;
        View findViewById = inflate.findViewById(R.id.jf9);
        o.LJIIIIZZ(findViewById, "rootLayout.findViewById(R.id.search_et)");
        EditText editText = (EditText) findViewById;
        this.LJLILLLLZI = editText;
        View findViewById2 = inflate.findViewById(R.id.avg);
        o.LJIIIIZZ(findViewById2, "rootLayout.findViewById(R.id.btn_clear)");
        ImageView imageView = (ImageView) findViewById2;
        this.LJLJI = imageView;
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: X.4NL
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
            
                if (r0.length() == 0) goto L17;
             */
            @Override // android.view.View.OnKeyListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onKey(android.view.View r4, int r5, android.view.KeyEvent r6) {
                /*
                    r3 = this;
                    r0 = 66
                    r2 = 1
                    if (r5 == r0) goto L45
                    r0 = 67
                    if (r5 == r0) goto Lb
                L9:
                    r2 = 0
                La:
                    return r2
                Lb:
                    int r0 = r6.getAction()
                    if (r0 != r2) goto L9
                    X.4NJ r0 = X.C4NJ.this
                    com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel r0 = r0.LJLJJI
                    if (r0 == 0) goto L29
                    androidx.lifecycle.LiveData<java.lang.String> r0 = r0.LJLJJL
                    java.lang.Object r0 = r0.getValue()
                    java.lang.String r0 = (java.lang.String) r0
                    if (r0 != 0) goto L23
                    java.lang.String r0 = ""
                L23:
                    int r0 = r0.length()
                    if (r0 != 0) goto L9
                L29:
                    X.4NJ r0 = X.C4NJ.this
                    com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel r1 = r0.LJLJJI
                    if (r1 == 0) goto La
                    androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>> r0 = r1.LJLJLLL
                    java.lang.Object r0 = r0.getValue()
                    java.util.List r0 = (java.util.List) r0
                    if (r0 == 0) goto L3f
                    java.util.List r0 = X.ORZ.LJLJL(r2, r0)
                    if (r0 != 0) goto L41
                L3f:
                    X.OQg r0 = X.C61878OQg.INSTANCE
                L41:
                    r1.hv0(r0)
                    goto La
                L45:
                    X.4NJ r1 = X.C4NJ.this
                    android.widget.EditText r0 = r1.LJLILLLLZI
                    r0.clearFocus()
                    android.widget.EditText r0 = r1.LJLILLLLZI
                    com.ss.android.ugc.aweme.base.utils.KeyboardUtils.LIZIZ(r0)
                    goto La
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4NL.onKey(android.view.View, int, android.view.KeyEvent):boolean");
            }
        });
        editText.setOnTouchListener(new IDTListenerS111S0100000_1(this, 0));
        C117524jM.LIZ(context, editText);
        editText.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 22)));
        editText.addTextChangedListener(new IDObjectS174S0100000_1(this, 0));
        C16880lQ.LJIILLIIL(imageView, new ACListenerS21S0100000_1(this, 23));
    }
}
