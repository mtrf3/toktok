package X;

import Y.ACListenerS21S0100000_1;
import Y.IDCListenerS242S0100000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4YK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YK extends LinearLayout implements InterfaceC102153zf, C47E {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public C4YM LJLJJI;
    public InterfaceC88472Yns<? super View, C76800UCe> LJLJJL;
    public boolean LJLJJLL;
    public C109544Rq LJLJL;

    private final C119244m8 getText() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-text>(...)");
        return (C119244m8) value;
    }

    public final Fragment getFragment() {
        return (Fragment) this.LJLILLLLZI.getValue();
    }

    public final ReadStateViewModel getReadStateVM() {
        return (ReadStateViewModel) this.LJLJI.getValue();
    }

    public final C4YM getCurrentStatus() {
        return this.LJLJJI;
    }

    public InterfaceC88472Yns<View, C76800UCe> getOnNotSentClickCallback() {
        return this.LJLJJL;
    }

    public final void LIZIZ(C102093zZ c102093zZ) {
        String str;
        Integer num;
        if (c102093zZ == null) {
            return;
        }
        String uuid = c102093zZ.LIZ.getUuid();
        C109544Rq c109544Rq = this.LJLJL;
        Integer num2 = null;
        if (c109544Rq != null) {
            str = c109544Rq.getUuid();
        } else {
            str = null;
        }
        if (o.LJ(uuid, str)) {
            LIZ(c102093zZ.LIZ, true);
            return;
        }
        List<Integer> value = C4YM.SENDING.getValue();
        C109544Rq c109544Rq2 = this.LJLJL;
        if (c109544Rq2 != null) {
            num = Integer.valueOf(c109544Rq2.getMsgStatus());
        } else {
            num = null;
        }
        if (ORZ.LJLJJI(num, value)) {
            return;
        }
        List<Integer> value2 = C4YM.NOTSENT.getValue();
        C109544Rq c109544Rq3 = this.LJLJL;
        if (c109544Rq3 != null) {
            num2 = Integer.valueOf(c109544Rq3.getMsgStatus());
        }
        if (ORZ.LJLJJI(num2, value2)) {
            return;
        }
        setVisibility(8);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C102093zZ c102093zZ) {
        LIZIZ(c102093zZ);
    }

    @Override // X.C47E
    public void setOnNotSentClickCallback(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && !this.LJLJJLL && C43J.LIZLLL()) {
            this.LJLJJLL = true;
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.b97, this, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4YK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 995));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 993));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 994));
        this.LJLJJI = C4YM.DEFAULT;
        if (C43J.LIZLLL()) {
            setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 230)));
            addOnAttachStateChangeListener(new IDCListenerS242S0100000_1(this, 2));
        }
    }

    @Override // X.C47E
    public final boolean LIZ(C109544Rq message, boolean z) {
        boolean z2;
        boolean z3;
        C102093zZ value;
        String str;
        o.LJIIIZ(message, "message");
        boolean z4 = false;
        if (!message.isSelf() || (!C43J.LIZLLL() && !C4YR.LIZIZ(message, C99033ud.Companion))) {
            return false;
        }
        this.LJLJL = message;
        int conversationType = message.getConversationType();
        int i = AbstractC63505Ow9.LIZIZ;
        if (conversationType == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        setTag(50331648, 6);
        setTag(134217728, this.LJLJL);
        int msgStatus = message.getMsgStatus();
        if (message.getConversationType() == i) {
            z3 = true;
        } else {
            z3 = false;
        }
        C4YM c4ym = C4YM.SENDING;
        if (c4ym.getValue().contains(Integer.valueOf(msgStatus))) {
            LIZJ(c4ym, z, z3, message);
        } else {
            C4YM c4ym2 = C4YM.SENT;
            if (c4ym2.getValue().contains(Integer.valueOf(msgStatus))) {
                LIZJ(c4ym2, z, z3, message);
            } else {
                C4YM c4ym3 = C4YM.NOTSENT;
                if (c4ym3.getValue().contains(Integer.valueOf(msgStatus))) {
                    LIZJ(c4ym3, z, z3, message);
                }
            }
        }
        if (z && message.isSelf() && !z2) {
            ReadStateViewModel readStateVM = getReadStateVM();
            if (readStateVM != null && readStateVM.iv0(message)) {
                LIZJ(C4YM.SEEN, z, z2, message);
            } else {
                ReadStateViewModel readStateVM2 = getReadStateVM();
                if (readStateVM2 != null && (value = readStateVM2.LJLIL.LIZJ().getValue()) != null) {
                    String uuid = value.LIZ.getUuid();
                    C109544Rq c109544Rq = this.LJLJL;
                    if (c109544Rq != null) {
                        str = c109544Rq.getUuid();
                    } else {
                        str = null;
                    }
                    if (o.LJ(uuid, str) && value.LIZIZ == 2) {
                        C4YM c4ym4 = C4YM.SEEN;
                        if (value.LIZ.getConversationType() == i) {
                            z4 = true;
                        }
                        LIZJ(c4ym4, true, z4, value.LIZ);
                    }
                }
            }
        }
        return true;
    }

    public final void LIZJ(C4YM status, boolean z, boolean z2, C109544Rq msg) {
        C4YM c4ym;
        java.util.Set<String> set;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(msg, "msg");
        if (!C43J.LIZLLL() && !C4YR.LIZIZ(msg, C99033ud.Companion)) {
            return;
        }
        setAlpha(1.0f);
        C4YQ block = C4YQ.LJLIL;
        o.LJIIIZ(block, "block");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            block.invoke(layoutParams);
            setLayoutParams(layoutParams);
        }
        C4YM c4ym2 = C4YM.NOTSENT;
        if (status == c4ym2 && C30581Hy.LJJII(msg)) {
            c4ym = C4YM.SENT;
        } else {
            c4ym = status;
        }
        C4YM c4ym3 = this.LJLJJI;
        C4YM c4ym4 = C4YM.SEEN;
        if (c4ym3 == c4ym4 && status == C4YM.SENT) {
            if (z2) {
                setVisibility(8);
            }
            if (!z) {
                setVisibility(8);
            }
            if (C4YR.LIZIZ(msg, C99033ud.Companion)) {
                C96963rI.LJIIIZ().getClass();
                C97223ri.LIZLLL(this, msg);
                return;
            }
            return;
        }
        if (c4ym3 == c4ym2 && status == c4ym4) {
            if (z2) {
                setVisibility(8);
            }
            if (!z) {
                setVisibility(8);
            }
            if (C4YR.LIZIZ(msg, C99033ud.Companion)) {
                C96963rI.LJIIIZ().getClass();
                C97223ri.LIZLLL(this, msg);
                return;
            }
            return;
        }
        this.LJLJJI = c4ym;
        int i = C4YO.LIZ[c4ym.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        setVisibility(8);
                        return;
                    }
                    if (z2) {
                        setVisibility(8);
                        return;
                    }
                    if (!z) {
                        setVisibility(8);
                        return;
                    }
                    if (C4YR.LIZIZ(msg, C99033ud.Companion)) {
                        setVisibility(8);
                        return;
                    }
                    setVisibility(0);
                    C119244m8 text = getText();
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_tick_circle;
                    c2068389v.LJ = Integer.valueOf(R.attr.gv);
                    c2068389v.LIZIZ = C7MY.LIZIZ(14);
                    c2068389v.LIZJ = C7MY.LIZIZ(14);
                    text.setStartIcon(c2068389v);
                    getText().setTextColorRes(R.attr.gv);
                    getText().setText(R.string.rlp);
                    return;
                }
                if (z2) {
                    setVisibility(8);
                    return;
                }
                if (!z) {
                    setVisibility(8);
                    return;
                }
                if (C4YR.LIZIZ(msg, C99033ud.Companion)) {
                    C96963rI.LJIIIZ().getClass();
                    C97223ri.LIZLLL(this, msg);
                    return;
                }
                setVisibility(0);
                C119244m8 text2 = getText();
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_arrow_topleft_circle_ltr;
                c2068389v2.LJ = Integer.valueOf(R.attr.gv);
                c2068389v2.LIZIZ = C7MY.LIZIZ(14);
                c2068389v2.LIZJ = C7MY.LIZIZ(14);
                text2.setStartIcon(c2068389v2);
                getText().setTextColorRes(R.attr.gv);
                getText().setText(R.string.rlr);
                return;
            }
            setVisibility(0);
            C119244m8 text3 = getText();
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_exclamation_mark_circle;
            c2068389v3.LJ = Integer.valueOf(R.attr.e7);
            c2068389v3.LIZIZ = C7MY.LIZIZ(14);
            c2068389v3.LIZJ = C7MY.LIZIZ(14);
            text3.setStartIcon(c2068389v3);
            getText().setTextColorRes(R.attr.e7);
            getText().setText(R.string.rlf);
            ReadStateViewModel readStateVM = getReadStateVM();
            if (readStateVM == null || (set = readStateVM.LJLJJLL) == null || !(!ORZ.LJLJJI(msg.getUuid(), set))) {
                return;
            }
            C101573yj.LJI(C101573yj.LIZ, msg, false);
            String uuid = msg.getUuid();
            if (uuid == null) {
                uuid = "";
            }
            set.add(uuid);
            return;
        }
        if (z2) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        C119244m8 text4 = getText();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C113524cu c113524cu = new C113524cu(context, R.raw.icon_spinner_thin);
        c113524cu.LJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
        c113524cu.LIZLLL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        c113524cu.LJFF(R.attr.gv, context2);
        c113524cu.LJIIIIZZ();
        text4.setCompoundDrawablesRelativeWithIntrinsicBounds(c113524cu, (Drawable) null, (Drawable) null, (Drawable) null);
        getText().setTextColorRes(R.attr.gv);
        getText().setText(R.string.rlq);
    }
}
