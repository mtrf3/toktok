package X;

import Y.IDCListenerS136S0100000_24;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ZlI, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class DialogC90860ZlI extends C18Z {
    public final ZY5 LJLJI;
    public final C90581Zgn LJLJJI;
    public final Context LJLJJL;
    public C90101ZXt LJLJJLL;
    public List<ZY4> LJLJL;
    public C90584Zgq LJLJLJ;
    public RecyclerView LJLJLLL;
    public boolean LJLL;
    public ZY4 LJLLI;
    public final long LJLLILLLL;
    public long LJLLJ;
    public final Handler LJLLL;

    public final void LJIJJ() {
        if (this.LJLLI == null && this.LJLL) {
            this.LJLJI.getClass();
            ZY5.LIZIZ();
            ArrayList arrayList = new ArrayList(ZY5.LIZJ.LJ);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                ZY4 zy4 = (ZY4) ListProtector.get(arrayList, i);
                if (zy4.LIZLLL() || !zy4.LJI || !zy4.LJII(this.LJLJJLL)) {
                    ListProtector.remove(arrayList, i);
                }
                size = i;
            }
            Collections.sort(arrayList, ZXN.LJLIL);
            if (SystemClock.uptimeMillis() - this.LJLLJ >= this.LJLLILLLL) {
                this.LJLLJ = SystemClock.uptimeMillis();
                ((ArrayList) this.LJLJL).clear();
                ((ArrayList) this.LJLJL).addAll(arrayList);
                this.LJLJLJ.LJLLLLLL();
                return;
            }
            this.LJLLL.removeMessages(1);
            Handler handler = this.LJLLL;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.LJLLJ + this.LJLLILLLL);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLL = true;
        this.LJLJI.LIZ(this.LJLJJLL, this.LJLJJI, 1);
        LJIJJ();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLL = false;
        this.LJLJI.LJI(this.LJLJJI);
        this.LJLLL.removeMessages(1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC90860ZlI(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = X.ZXT.LIZ(r3, r0)
            int r0 = X.ZXT.LIZIZ(r1)
            r2.<init>(r1, r0)
            X.ZXt r0 = X.C90101ZXt.LIZJ
            r2.LJLJJLL = r0
            Y.IDHandlerS26S0100000_24 r1 = new Y.IDHandlerS26S0100000_24
            r0 = 1
            r1.<init>(r2, r0)
            r2.LJLLL = r1
            android.content.Context r1 = r2.getContext()
            X.ZY5 r0 = X.ZY5.LIZJ(r1)
            r2.LJLJI = r0
            X.Zgn r0 = new X.Zgn
            r0.<init>(r2)
            r2.LJLJJI = r0
            r2.LJLJJL = r1
            android.content.res.Resources r1 = r1.getResources()
            r0 = 1812463621(0x6c080005, float:6.57656E26)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r2.LJLLILLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC90860ZlI.<init>(android.content.Context):void");
    }

    public final void LJIJJLI(C90101ZXt c90101ZXt) {
        if (c90101ZXt != null) {
            if (!this.LJLJJLL.equals(c90101ZXt)) {
                this.LJLJJLL = c90101ZXt;
                if (this.LJLL) {
                    this.LJLJI.LJI(this.LJLJJI);
                    this.LJLJI.LIZ(c90101ZXt, this.LJLJJI, 1);
                }
                LJIJJ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int LIZ;
        super.onCreate(bundle);
        setContentView(R.layout.q);
        ZXT.LJIIIZ(this.LJLJJL, this);
        this.LJLJL = new ArrayList();
        C16880lQ.LJIILL((ImageButton) findViewById(R.id.be), new IDCListenerS136S0100000_24(this, 3));
        this.LJLJLJ = new C90584Zgq(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bg);
        this.LJLJLLL = recyclerView;
        recyclerView.setAdapter(this.LJLJLJ);
        this.LJLJLLL.setLayoutManager(new LinearLayoutManager());
        Context context = this.LJLJJL;
        int i = -1;
        if (!context.getResources().getBoolean(R.bool.a)) {
            LIZ = -1;
        } else {
            LIZ = ZXL.LIZ(context);
        }
        if (this.LJLJJL.getResources().getBoolean(R.bool.a)) {
            i = -2;
        }
        getWindow().setLayout(LIZ, i);
    }
}
