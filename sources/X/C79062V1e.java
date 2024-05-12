package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.V1e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C79062V1e implements FWB {
    @Override // X.FWB
    public void invoke(Object[] objArr) {
        try {
            OJY LJIL = C73340SqO.LJIL();
            Context LIZIZ = EF7.LIZIZ();
            AwemeRawAd awemeRawAd = (AwemeRawAd) objArr[0];
            String str = (String) objArr[1];
            LJIL.getClass();
            OJY.LJIIJJI(LIZIZ, awemeRawAd, str);
        } catch (Exception unused) {
        }
    }

    public static int LJ(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static void LJFF(int i, C65403Plf c65403Plf, String str) {
        c65403Plf.LJIJJ(Integer.valueOf(i));
        c65403Plf.LJI(str);
    }

    public static void LJI(String str, int i, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
    }

    public static int LIZ(InterfaceC44951pb modifier, InterfaceC39181gI interfaceC39181gI, InterfaceC274115t measurable, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        o.LJIIIZ(measurable, "measurable");
        o.LJIIIZ(modifier, "modifier");
        return modifier.LJIILL(new C536628s(interfaceC39181gI, interfaceC39181gI.getLayoutDirection()), new C44881pU(measurable, EnumC273815q.Max, EnumC273915r.Height), C78555UsJ.LJ(i, 0, 13)).getHeight();
    }

    public static int LIZIZ(InterfaceC44951pb modifier, InterfaceC39181gI interfaceC39181gI, InterfaceC274115t measurable, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        o.LJIIIZ(measurable, "measurable");
        o.LJIIIZ(modifier, "modifier");
        return modifier.LJIILL(new C536628s(interfaceC39181gI, interfaceC39181gI.getLayoutDirection()), new C44881pU(measurable, EnumC273815q.Max, EnumC273915r.Width), C78555UsJ.LJ(0, i, 7)).getWidth();
    }

    public static int LIZJ(InterfaceC44951pb modifier, InterfaceC39181gI interfaceC39181gI, InterfaceC274115t measurable, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        o.LJIIIZ(measurable, "measurable");
        o.LJIIIZ(modifier, "modifier");
        return modifier.LJIILL(new C536628s(interfaceC39181gI, interfaceC39181gI.getLayoutDirection()), new C44881pU(measurable, EnumC273815q.Min, EnumC273915r.Height), C78555UsJ.LJ(i, 0, 13)).getHeight();
    }

    public static int LIZLLL(InterfaceC44951pb modifier, InterfaceC39181gI interfaceC39181gI, InterfaceC274115t measurable, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        o.LJIIIZ(measurable, "measurable");
        o.LJIIIZ(modifier, "modifier");
        return modifier.LJIILL(new C536628s(interfaceC39181gI, interfaceC39181gI.getLayoutDirection()), new C44881pU(measurable, EnumC273815q.Min, EnumC273915r.Width), C78555UsJ.LJ(0, i, 7)).getWidth();
    }

    public static void LJII(StringBuilder sb, int i, StringBuilder sb2, int i2, int i3, String str) {
        sb.append(i);
        C48284IxE.LIZ(i2, i3, str, X1D.LIZIZ(sb2));
    }
}
