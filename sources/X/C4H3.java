package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.botanswercard.TakoAnswerContentView$mobInteractionShow$1$1$1;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4H3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4H3 extends LinearLayout implements C4H9 {
    public InterfaceC1044448a LJLIL;
    public String LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final C4H5 getMakeDownParser() {
        return (C4H5) this.LJLJI.getValue();
    }

    private final TuxTextView getMarkDownTextView() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(101);
        tuxTextView.setTextColorRes(R.attr.go);
        tuxTextView.setLineSpacing(C32151Nz.LJIIZILJ(3), 1.0f);
        return tuxTextView;
    }

    public final String getCopyStr() {
        String str = this.LJLILLLLZI;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.C4H9
    public Rect getCustomLongPressVisibleRect() {
        InterfaceC1044448a interfaceC1044448a = this.LJLIL;
        if (interfaceC1044448a != null) {
            return interfaceC1044448a.LIZ();
        }
        return null;
    }

    public final InterfaceC1044448a getCallback$im_base_release() {
        return this.LJLIL;
    }

    public final void setCallback$im_base_release(InterfaceC1044448a interfaceC1044448a) {
        this.LJLIL = interfaceC1044448a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4H3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = C221108m2.LIZIZ(C4H7.LJLIL);
        setOrientation(1);
    }

    public final void LIZIZ(C4H4 c4h4, C99033ud c99033ud, String str) {
        Lifecycle lifecycle;
        if (c99033ud == null) {
            return;
        }
        C97113rX.LIZIZ(c99033ud.getEnterFromForMob(), c99033ud.getEnterMethod(), c99033ud.getSearchId(), c99033ud.getConversationId(), getMakeDownParser().LIZ(c4h4.LJLIL, C61878OQg.INSTANCE), str, String.valueOf(c4h4.LJLJI), null);
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            int hashCode = topActivity.hashCode();
            java.util.Map<Integer, java.util.Set<Integer>> map = C97113rX.LIZ;
            java.util.Set set = (java.util.Set) ((LinkedHashMap) map).get(Integer.valueOf(hashCode));
            if (set != null) {
                set.add(Integer.valueOf(c4h4.LJLIL.hashCode()));
                return;
            }
            map.put(Integer.valueOf(hashCode), C77275UUl.LJ(Integer.valueOf(c4h4.LJLIL.hashCode())));
            Activity topActivity2 = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity2, "getTopActivity()");
            LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(topActivity2);
            if (LIZIZ == null || (lifecycle = LIZIZ.getLifecycle()) == null) {
                return;
            }
            lifecycle.addObserver(new TakoAnswerContentView$mobInteractionShow$1$1$1(hashCode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.im.message.template.component.TextComponent r15, X.AnonymousClass481 r16, X.C99033ud r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4H3.LIZ(com.ss.android.ugc.aweme.im.message.template.component.TextComponent, X.481, X.3ud, java.lang.String):void");
    }
}
