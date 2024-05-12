package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244039hv extends SIT {
    public final List<Integer> LJLJJLL;
    public C2312295q LJLJL;

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        LJIIJ(false);
        Iterator<Integer> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            this.LJLJJL.LIZJ(new C243999hr(it.next().intValue()));
        }
    }

    public C244039hv(List<Integer> list) {
        this.LJLJJLL = list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.95q] */
    public final void LJIIJ(boolean z) {
        final Context context = this.LJLJI;
        if (context != null) {
            if ((!this.LJLJJLL.isEmpty()) || z) {
                ?? r1 = new LinearLayout(context) { // from class: X.95q
                    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

                    public final View LIZ(int i) {
                        java.util.Map<Integer, View> map = this.LJLIL;
                        View view = map.get(Integer.valueOf(i));
                        if (view != null) {
                            return view;
                        }
                        View findViewById = findViewById(i);
                        if (findViewById == null) {
                            return null;
                        }
                        map.put(Integer.valueOf(i), findViewById);
                        return findViewById;
                    }

                    {
                        boolean z2;
                        C16880lQ.LLLZIIL(R.layout.c3x, C16880lQ.LLZIL(getContext()), this);
                        int LIZ = C238309Ww.LIZ();
                        if (LIZ == 1 || LIZ == 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            View chunk_header_fl = LIZ(R.id.bbf);
                            int LJJJLL = (int) C44384HbQ.LJJJLL(8);
                            int LJJJLL2 = (int) C44384HbQ.LJJJLL(0);
                            int LJJJLL3 = (int) C44384HbQ.LJJJLL(16);
                            int LJJJLL4 = (int) C44384HbQ.LJJJLL(0);
                            o.LJIIIIZZ(chunk_header_fl, "chunk_header_fl");
                            C26338AVi.LJI(chunk_header_fl, Integer.valueOf(LJJJLL3), Integer.valueOf(LJJJLL), Integer.valueOf(LJJJLL4), Integer.valueOf(LJJJLL2), false, 16);
                            View chunk_header = LIZ(R.id.bbe);
                            int LJJJLL5 = (int) C44384HbQ.LJJJLL(0);
                            int LJJJLL6 = (int) C44384HbQ.LJJJLL(0);
                            int LJJJLL7 = (int) C44384HbQ.LJJJLL(0);
                            int LJJJLL8 = (int) C44384HbQ.LJJJLL(0);
                            o.LJIIIIZZ(chunk_header, "chunk_header");
                            C26338AVi.LJI(chunk_header, Integer.valueOf(LJJJLL7), Integer.valueOf(LJJJLL5), Integer.valueOf(LJJJLL8), Integer.valueOf(LJJJLL6), false, 16);
                            return;
                        }
                        int LIZ2 = C238309Ww.LIZ();
                        if (LIZ2 != 2 && LIZ2 != 4) {
                            return;
                        }
                        LIZ(R.id.bbf).setVisibility(8);
                    }

                    public final void setChunkText(String text) {
                        o.LJIIIZ(text, "text");
                        ((TextView) LIZ(R.id.bbe)).setText(text);
                    }
                };
                this.LJLJL = r1;
                r1.setChunkText(C44384HbQ.LJJZ(R.string.h2b));
                C2312295q c2312295q = this.LJLJL;
                if (c2312295q != null) {
                    LIZIZ(0, c2312295q);
                } else {
                    o.LJIJI("headerView");
                    throw null;
                }
            }
        }
    }
}
