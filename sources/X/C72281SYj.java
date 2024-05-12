package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.SYj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72281SYj extends C0A6 implements PH7, PH6 {
    public final C57939MoZ LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final SZ0 LJLJI;
    public final C62822Ol8 LJLJJI;
    public volatile boolean LJLJJL;

    public final String LJIILLIIL() {
        String str = this.LJLIL.LJI;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("powerlist_fps_");
        LIZ.append(this.LJLIL.LJI);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.PH6
    public final void LIZJ(JSONObject jSONObject) {
        Iterator<String> keys;
        Integer num;
        int i;
        Integer num2;
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            Iterator it = OJ6.LJJIJLIJ(keys).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object obj = jSONObject.get((String) it.next());
                if ((obj instanceof Integer) && (num2 = (Integer) obj) != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                i2 += i;
            }
            if (i2 == 0) {
                return;
            }
            C76732zl c76732zl = new C76732zl();
            C76732zl c76732zl2 = new C76732zl();
            C76732zl c76732zl3 = new C76732zl();
            C76732zl c76732zl4 = new C76732zl();
            C76732zl c76732zl5 = new C76732zl();
            C76732zl c76732zl6 = new C76732zl();
            Iterator<String> keys2 = jSONObject.keys();
            if (keys2 != null) {
                Iterator it2 = OJ6.LJJIJLIJ(keys2).iterator();
                while (it2.hasNext()) {
                    Object obj2 = jSONObject.get((String) it2.next());
                    if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                        int intValue = num.intValue();
                        if (intValue == 0) {
                            c76732zl.element = c76732zl.element;
                        } else {
                            if (1 <= intValue) {
                                if (intValue < 3) {
                                    c76732zl2.element += intValue;
                                } else if (3 <= intValue) {
                                    if (intValue < 7) {
                                        c76732zl3.element += intValue;
                                    } else if (7 <= intValue) {
                                        if (intValue < 14) {
                                            c76732zl4.element += intValue;
                                        } else if (intValue < 26) {
                                            c76732zl5.element += intValue;
                                        }
                                    }
                                }
                            }
                            c76732zl6.element += intValue;
                        }
                    }
                }
            }
            this.LJLJI.LIZJ(C65352Pkq.LIZ(SZ1.class), new C72282SYk(c76732zl, i2, c76732zl2, c76732zl3, c76732zl4, c76732zl5, c76732zl6));
        }
    }

    @Override // X.PH7
    public final void LIZLLL(double d) {
        this.LJLJI.LIZJ(C65352Pkq.LIZ(SZ2.class), new C72288SYq(d));
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            if (this.LJLJJL) {
                C06140Ly.LIZJ(LJIILLIIL());
                if (!this.LJLJJL) {
                    return;
                }
                this.LJLJJL = false;
                ((PH4) this.LJLJJI.getValue()).LJ();
                return;
            }
            return;
        }
        if (this.LJLJJL || this.LJLJJL) {
            return;
        }
        C06140Ly.LIZ(LJIILLIIL());
        this.LJLJJL = true;
        ((PH4) this.LJLJJI.getValue()).LIZLLL();
    }

    public C72281SYj(C57939MoZ config, RecyclerView list, SZ0 tracker) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(list, "list");
        o.LJIIIZ(tracker, "tracker");
        this.LJLIL = config;
        this.LJLILLLLZI = list;
        this.LJLJI = tracker;
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1263));
    }
}
