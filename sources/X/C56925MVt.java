package X;

import android.graphics.Color;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TextLinkConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.MVt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C56925MVt extends TBS implements InterfaceC88471Ynr<TextLinkConfig, C116724i4, C76800UCe> {
    public C56925MVt(C56912MVg c56912MVg) {
        super(2, c56912MVg, C56912MVg.class, "buildTextLink", "buildTextLink(Lcom/ss/android/ugc/aweme/notice/repo/list/uitemplate/TextLinkConfig;Lcom/bytedance/ies/dmt/ui/text/DmtText$BidiConcat;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.MWa] */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TextLinkConfig textLinkConfig, C116724i4 c116724i4) {
        T5U t5u;
        TextLinkConfig p0 = textLinkConfig;
        C116724i4 p1 = c116724i4;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        C56912MVg c56912MVg = (C56912MVg) this.receiver;
        c56912MVg.getClass();
        Integer valueOf = Integer.valueOf(p0.type);
        Integer num = null;
        if (valueOf == null || valueOf.intValue() != 2) {
            t5u = null;
        } else {
            if (C53341Kwb.LIZ()) {
                Integer pressedTextColor = c56912MVg.getPressedTextColor();
                if (pressedTextColor != null) {
                    int intValue = pressedTextColor.intValue();
                    num = Integer.valueOf(Color.argb(O6R.LJJIIZ(Color.alpha(intValue) * 0.2f), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
                }
            } else {
                num = c56912MVg.getPressedTextColor();
            }
            t5u = new T5U(52, false);
            Integer normalTextColor = c56912MVg.getNormalTextColor();
            if (normalTextColor != null) {
                int intValue2 = normalTextColor.intValue();
                if (num != null) {
                    num = new C56932MWa(null, 100, intValue2, num.intValue(), new MW0(c56912MVg, p0));
                }
            }
            return C76800UCe.LIZ;
        }
        String str = p0.text;
        if (str == null) {
            str = "";
        }
        p1.LIZJ(str, num);
        int length = p1.LIZ.length();
        p1.LIZ.setSpan(t5u, length - str.length(), length, 33);
        return C76800UCe.LIZ;
    }
}
