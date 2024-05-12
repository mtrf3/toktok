package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.QYo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC67190QYo implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    private final void LIZIZ() {
        boolean LIZ;
        try {
            C67158QXi c67158QXi = (C67158QXi) this.LJLILLLLZI;
            synchronized (c67158QXi.LIZ) {
                if (c67158QXi.LIZIZ()) {
                    c67158QXi.LIZLLL();
                    if (c67158QXi.LIZIZ()) {
                        c67158QXi.LIZJ = 1;
                        c67158QXi.LJ();
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZ() {
        String str;
        C67191QYp c67191QYp = ((C68082Qnm) this.LJLILLLLZI).LJIILIIL;
        c67191QYp.LIZ.LIZIZ().LJFF();
        if (!c67191QYp.LIZIZ()) {
            return;
        }
        if (c67191QYp.LIZJ()) {
            c67191QYp.LIZ.LJIILLIIL().LJIJI.LIZIZ(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            c67191QYp.LIZ.LJIJ().LJIIL("auto", "_cmpx", bundle);
        } else {
            String LIZ = c67191QYp.LIZ.LJIILLIIL().LJIJI.LIZ();
            if (TextUtils.isEmpty(LIZ)) {
                c67191QYp.LIZ.LIZJ().LJI.LIZ("Cache still valid but referrer not found");
            } else {
                long LIZ2 = ((c67191QYp.LIZ.LJIILLIIL().LJIJJ.LIZ() / 3600000) - 1) * 3600000;
                android.net.Uri parse = UriProtector.parse(LIZ);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : UriProtector.getQueryParameterNames(parse)) {
                    bundle2.putString(str2, UriProtector.getQueryParameter(parse, str2));
                }
                ((BaseBundle) pair.second).putLong("_cc", LIZ2);
                Object obj = pair.first;
                if (obj == null) {
                    str = "app";
                } else {
                    str = (String) obj;
                }
                c67191QYp.LIZ.LJIJ().LJIIL(str, "_cmp", (Bundle) pair.second);
            }
            c67191QYp.LIZ.LJIILLIIL().LJIJI.LIZIZ(null);
        }
        c67191QYp.LIZ.LJIILLIIL().LJIJJ.LIZIZ(0L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    QYU qyu = (QYU) this.LJLILLLLZI;
                    synchronized (qyu) {
                        if (qyu.LJLIL == 1) {
                            qyu.LIZ(1, "Timed out while binding");
                        }
                    }
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            case 1:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                LIZIZ();
                return;
        }
    }

    public /* synthetic */ RunnableC67190QYo(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
