package X;

import Y.AUListenerS90S0100000_1;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4YJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YJ extends LinearLayout implements InterfaceC102153zf, C47E {
    public ValueAnimator LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public C4YL LJLJJL;
    public InterfaceC88472Yns<? super View, C76800UCe> LJLJJLL;
    public final AqS148S0200000_1 LJLJL;
    public C109544Rq LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4YJ(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4YJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Fragment getFragment() {
        return (Fragment) this.LJLJI.getValue();
    }

    public final ReadStateViewModel getReadStateVM() {
        return (ReadStateViewModel) this.LJLJJI.getValue();
    }

    public final C4YL getCurrentStatus() {
        return this.LJLJJL;
    }

    public InterfaceC88472Yns<View, C76800UCe> getOnNotSentClickCallback() {
        return this.LJLJJLL;
    }

    public final void LIZJ(C102093zZ c102093zZ) {
        String str;
        Integer num;
        if (c102093zZ == null) {
            return;
        }
        String uuid = c102093zZ.LIZ.getUuid();
        C109544Rq c109544Rq = this.LJLJLJ;
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
        List<Integer> value = C4YL.SENDING.getValue();
        C109544Rq c109544Rq2 = this.LJLJLJ;
        if (c109544Rq2 != null) {
            num = Integer.valueOf(c109544Rq2.getMsgStatus());
        } else {
            num = null;
        }
        if (ORZ.LJLJJI(num, value)) {
            return;
        }
        List<Integer> value2 = C4YL.NOTSENT.getValue();
        C109544Rq c109544Rq3 = this.LJLJLJ;
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
        LIZJ(c102093zZ);
    }

    @Override // X.C47E
    public void setOnNotSentClickCallback(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.LJLJJLL = interfaceC88472Yns;
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
        if (!this.LJLILLLLZI) {
            this.LJLJL.invoke();
        }
        this.LJLJLJ = message;
        int conversationType = message.getConversationType();
        int i = AbstractC63505Ow9.LIZIZ;
        if (conversationType == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        setTag(50331648, 6);
        setTag(134217728, this.LJLJLJ);
        int msgStatus = message.getMsgStatus();
        if (message.getConversationType() == i) {
            z3 = true;
        } else {
            z3 = false;
        }
        C4YL c4yl = C4YL.SENDING;
        if (c4yl.getValue().contains(Integer.valueOf(msgStatus))) {
            LIZLLL(c4yl, z, z3, message);
        } else {
            C4YL c4yl2 = C4YL.SENT;
            if (c4yl2.getValue().contains(Integer.valueOf(msgStatus))) {
                LIZLLL(c4yl2, z, z3, message);
            } else {
                C4YL c4yl3 = C4YL.NOTSENT;
                if (c4yl3.getValue().contains(Integer.valueOf(msgStatus))) {
                    LIZLLL(c4yl3, z, z3, message);
                }
            }
        }
        if (z && message.isSelf() && !z2) {
            ReadStateViewModel readStateVM = getReadStateVM();
            if (readStateVM != null && readStateVM.iv0(message)) {
                LIZLLL(C4YL.SEEN, z, z2, message);
            } else {
                ReadStateViewModel readStateVM2 = getReadStateVM();
                if (readStateVM2 != null && (value = readStateVM2.LJLIL.LIZJ().getValue()) != null) {
                    String uuid = value.LIZ.getUuid();
                    C109544Rq c109544Rq = this.LJLJLJ;
                    if (c109544Rq != null) {
                        str = c109544Rq.getUuid();
                    } else {
                        str = null;
                    }
                    if (o.LJ(uuid, str) && value.LIZIZ == 2) {
                        C4YL c4yl4 = C4YL.SEEN;
                        if (value.LIZ.getConversationType() == i) {
                            z4 = true;
                        }
                        LIZLLL(c4yl4, true, z4, value.LIZ);
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4YJ(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r3, r0)
            r2.LJLJLLL = r0
            r0 = 0
            r2.<init>(r3, r4, r0)
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 142(0x8e, float:1.99E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 143(0x8f, float:2.0E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJI = r0
            X.4YL r0 = X.C4YL.DEFAULT
            r2.LJLJJL = r0
            kotlin.jvm.internal.AqS148S0200000_1 r1 = new kotlin.jvm.internal.AqS148S0200000_1
            r0 = 11
            r1.<init>(r2, r3, r0)
            r2.LJLJL = r1
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L44
            boolean r0 = X.C43J.LIZLLL()
            if (r0 == 0) goto L47
        L44:
            r1.invoke()
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YJ.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LIZLLL(C4YL status, boolean z, boolean z2, C109544Rq msg) {
        C4YL c4yl;
        java.util.Set<String> set;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(msg, "msg");
        if (!C43J.LIZLLL() && !C4YR.LIZIZ(msg, C99033ud.Companion)) {
            return;
        }
        if (!this.LJLILLLLZI) {
            this.LJLJL.invoke();
        }
        setAlpha(1.0f);
        C4YP block = C4YP.LJLIL;
        o.LJIIIZ(block, "block");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            block.invoke(layoutParams);
            setLayoutParams(layoutParams);
        }
        C4YL c4yl2 = C4YL.NOTSENT;
        if (status == c4yl2 && C30581Hy.LJJII(msg)) {
            c4yl = C4YL.SENT;
        } else {
            c4yl = status;
        }
        C4YL c4yl3 = this.LJLJJL;
        C4YL c4yl4 = C4YL.SEEN;
        if (c4yl3 == c4yl4 && status == C4YL.SENT) {
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
        if (c4yl3 == c4yl2 && status == c4yl4) {
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
        this.LJLJJL = c4yl;
        if (Looper.myLooper() != null) {
            LIZIZ(R.id.e_q).setRotation(0.0f);
            ValueAnimator valueAnimator = this.LJLIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        int i = C4YN.LIZ[c4yl.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        setVisibility(8);
                        return;
                    } else {
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
                        ((TuxIconView) LIZIZ(R.id.e_q)).setIconRes(R.raw.icon_tick_circle);
                        ((TuxIconView) LIZIZ(R.id.e_q)).setTintColorRes(R.attr.gv);
                        ((TuxTextView) LIZIZ(R.id.text)).setTextColorRes(R.attr.gv);
                        ((TextView) LIZIZ(R.id.text)).setText(R.string.rlp);
                        return;
                    }
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
                ((TuxIconView) LIZIZ(R.id.e_q)).setIconRes(R.raw.icon_arrow_topleft_circle_ltr);
                ((TuxIconView) LIZIZ(R.id.e_q)).setTintColorRes(R.attr.gv);
                ((TuxTextView) LIZIZ(R.id.text)).setTextColorRes(R.attr.gv);
                ((TextView) LIZIZ(R.id.text)).setText(R.string.rlr);
                return;
            }
            setVisibility(0);
            ((TuxIconView) LIZIZ(R.id.e_q)).setIconRes(R.raw.icon_exclamation_mark_circle);
            ((TuxIconView) LIZIZ(R.id.e_q)).setTintColorRes(R.attr.e7);
            ((TuxTextView) LIZIZ(R.id.text)).setTextColorRes(R.attr.e7);
            ((TextView) LIZIZ(R.id.text)).setText(R.string.rlf);
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
        if (Looper.myLooper() != null) {
            ValueAnimator valueAnimator2 = this.LJLIL;
            if (valueAnimator2 == null) {
                valueAnimator2 = new ValueAnimator();
                valueAnimator2.setValues(PropertyValuesHolder.ofInt("ROTATE", 0, 360));
                valueAnimator2.setInterpolator(new LinearInterpolator());
                valueAnimator2.setDuration(1000L);
                valueAnimator2.setRepeatMode(1);
                valueAnimator2.setRepeatCount(-1);
                valueAnimator2.addUpdateListener(new AUListenerS90S0100000_1(this, 80));
            }
            this.LJLIL = valueAnimator2;
            valueAnimator2.start();
        }
        ((TuxIconView) LIZIZ(R.id.e_q)).setIconRes(R.raw.icon_spinner_thin);
        ((TuxIconView) LIZIZ(R.id.e_q)).setTintColorRes(R.attr.gv);
        ((TuxTextView) LIZIZ(R.id.text)).setTextColorRes(R.attr.gv);
        ((TextView) LIZIZ(R.id.text)).setText(R.string.rlq);
    }
}
