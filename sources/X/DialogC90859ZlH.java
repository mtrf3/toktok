package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.ZlH, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class DialogC90859ZlH extends C18Z {
    public final ZY5 LJLJI;
    public final C90575Zgh LJLJJI;
    public TextView LJLJJL;
    public C90101ZXt LJLJJLL;
    public ArrayList<ZY4> LJLJL;
    public ZXA LJLJLJ;
    public ListView LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public final Handler LJLLILLLL;

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LJLL = false;
        this.LJLJI.LJI(this.LJLJJI);
        this.LJLLILLLL.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public final void LJIJJ() {
        if (this.LJLL) {
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
            Collections.sort(arrayList, ZXB.LJLIL);
            if (SystemClock.uptimeMillis() - this.LJLLI >= 300) {
                this.LJLLI = SystemClock.uptimeMillis();
                this.LJLJL.clear();
                this.LJLJL.addAll(arrayList);
                this.LJLJLJ.notifyDataSetChanged();
                return;
            }
            this.LJLLILLLL.removeMessages(1);
            Handler handler = this.LJLLILLLL;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.LJLLI + 300);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLL = true;
        this.LJLJI.LIZ(this.LJLJJLL, this.LJLJJI, 1);
        LJIJJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC90859ZlH(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = X.ZXT.LIZ(r3, r0)
            int r0 = X.ZXT.LIZIZ(r1)
            r2.<init>(r1, r0)
            X.ZXt r0 = X.C90101ZXt.LIZJ
            r2.LJLJJLL = r0
            Y.IDHandlerS26S0100000_24 r1 = new Y.IDHandlerS26S0100000_24
            r0 = 0
            r1.<init>(r2, r0)
            r2.LJLLILLLL = r1
            android.content.Context r0 = r2.getContext()
            X.ZY5 r0 = X.ZY5.LIZJ(r0)
            r2.LJLJI = r0
            X.Zgh r0 = new X.Zgh
            r0.<init>(r2)
            r2.LJLJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC90859ZlH.<init>(android.content.Context):void");
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
        super.onCreate(bundle);
        setContentView(R.layout.m);
        this.LJLJL = new ArrayList<>();
        this.LJLJLJ = new ZXA(getContext(), this.LJLJL);
        ListView listView = (ListView) findViewById(R.id.av);
        this.LJLJLLL = listView;
        listView.setAdapter((ListAdapter) this.LJLJLJ);
        this.LJLJLLL.setOnItemClickListener(this.LJLJLJ);
        this.LJLJLLL.setEmptyView(findViewById(android.R.id.empty));
        this.LJLJJL = (TextView) findViewById(R.id.b0);
        getWindow().setLayout(ZXL.LIZ(getContext()), -2);
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setTitle(int i) {
        this.LJLJJL.setText(i);
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.LJLJJL.setText(charSequence);
    }
}
