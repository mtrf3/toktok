package X;

import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.L7x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC53757L7x implements Runnable {
    public final /* synthetic */ InterfaceC53758L7y LJLIL;
    public final /* synthetic */ JSONObject LJLILLLLZI;
    public final /* synthetic */ LinkedHashMap LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ Integer LJLJJL;

    public RunnableC53757L7x(C86602Xyo c86602Xyo, Integer num, Integer num2, LinkedHashMap linkedHashMap, JSONObject jSONObject) {
        this.LJLIL = c86602Xyo;
        this.LJLILLLLZI = jSONObject;
        this.LJLJI = linkedHashMap;
        this.LJLJJI = num;
        this.LJLJJL = num2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }
}
