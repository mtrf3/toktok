package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HaY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44330HaY extends AbstractC44341Haj {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82632Wbs LJLJJI;

    static {
        TBT tbt = new TBT(C44330HaY.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC44341Haj
    public final long LIZ() {
        return 5L;
    }

    public final ActivityC45651qj LIZLLL() {
        return (ActivityC45651qj) this.LJLJJI.LIZ(this, LJLJJL[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44330HaY(C82622Wbi context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJI = UCI.LJI(this.LJLIL, ActivityC45651qj.class, null);
    }

    @Override // X.AbstractC44341Haj
    public final void LIZIZ(int i, long j, String str) {
        String string;
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        int i2 = -1;
        if (jSONObject.has("state")) {
            i2 = jSONObject.optInt("state", -1);
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            string = "";
                        } else {
                            string = LIZLLL().getString(R.string.r84);
                        }
                    } else {
                        string = LIZLLL().getString(R.string.r83);
                    }
                } else {
                    string = LIZLLL().getString(R.string.r7h);
                }
            } else {
                string = LIZLLL().getString(R.string.r82);
            }
        } else {
            string = LIZLLL().getString(R.string.r81);
        }
        o.LJIIIIZZ(string, "when (state) {\n         …\"\n            }\n        }");
        if (string.length() > 0) {
            LIZJ(new AqS74S1100000_7(this, string, 17));
        }
    }
}
