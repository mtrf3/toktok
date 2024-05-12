package X;

import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.nows.campaign.p004new.year.NowNewYearEventConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.7qA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198187qA extends AbstractC65781Prl implements InterfaceC65784Pro<EnumC198137q5> {
    public static final C198187qA LJLIL = new C198187qA();

    public C198187qA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final EnumC198137q5 invoke() {
        String str;
        p LJJIJL;
        C198177q9.LIZ.getClass();
        m mVar = ((NowNewYearEventConfig) C198177q9.LIZJ.getValue()).regions;
        if (mVar != null && (LJJIJL = mVar.LJJIJL((String) C198177q9.LIZLLL.getValue())) != null) {
            if (LJJIJL.LJLIL instanceof String) {
                str = LJJIJL.LJJIFFI();
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        if (o.LJ(str, "C")) {
            return EnumC198137q5.CHRISTMAS;
        }
        if (o.LJ(str, "N")) {
            return EnumC198137q5.NEW_YEAR;
        }
        return EnumC198137q5.NO_EVENT;
    }
}
