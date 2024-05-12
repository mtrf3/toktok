package X;

import Y.ACListenerS30S0101000_13;
import Y.ACListenerS33S0100000_13;
import Y.IDCListenerS143S0200000_13;
import android.content.Context;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;

/* loaded from: classes14.dex */
public final class U3D extends U2M {
    public final U3Z LJLJJL;
    public final ShowConfig LJLJJLL;
    public LiveIconView LJLJL;
    public C41071jL LJLJLJ;
    public C2A7 LJLJLLL;
    public C2A7 LJLL;
    public C2A7 LJLLI;
    public C2A7 LJLLILLLL;
    public C2A7 LJLLJ;
    public C2A7 LJLLL;
    public ImageView LJLLLL;
    public ImageView LJLLLLLL;
    public ImageView LJLZ;
    public ImageView LJZ;
    public ImageView LJZI;
    public ImageView LJZL;
    public int LL;
    public int LLD;
    public boolean LLF;
    public final HashMap<Integer, ImageView> LLFF;
    public final HashMap<Integer, C2A7> LLFFF;
    public UHL LLFII;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cz8;
    }

    public final void LJJIJ() {
        U3Z u3z = this.LJLJJL;
        ShowConfig showConfig = new ShowConfig();
        int i = this.LLD;
        if (i == 0) {
            i = this.LL;
        }
        showConfig.durationPerGuest = i * 60;
        showConfig.allowOpenMicFreely = this.LLF;
        u3z.LIZIZ(showConfig);
    }

    @Override // X.U2M
    public final void LJJIIJZLJL() {
        Boolean bool;
        this.LJLJJI = findViewById(R.id.fz1);
        this.LJLJL = (LiveIconView) findViewById(R.id.fz2);
        this.LJLJLJ = (C41071jL) findViewById(R.id.js1);
        this.LJLJLLL = (C2A7) findViewById(R.id.jrt);
        this.LJLL = (C2A7) findViewById(R.id.jrv);
        this.LJLLI = (C2A7) findViewById(R.id.jrn);
        this.LJLLILLLL = (C2A7) findViewById(R.id.jrp);
        this.LJLLJ = (C2A7) findViewById(R.id.jrr);
        this.LJLLL = (C2A7) findViewById(R.id.jrx);
        this.LJLLLL = (ImageView) findViewById(R.id.jru);
        this.LJLLLLLL = (ImageView) findViewById(R.id.jrw);
        this.LJLZ = (ImageView) findViewById(R.id.jro);
        this.LJZ = (ImageView) findViewById(R.id.jrq);
        this.LJZI = (ImageView) findViewById(R.id.jrs);
        this.LJZL = (ImageView) findViewById(R.id.jry);
        C2A7 c2a7 = this.LJLJLLL;
        if (c2a7 != null) {
            c2a7.setText(C15380j0.LJIILL(R.string.ndo, 3));
        }
        C2A7 c2a72 = this.LJLL;
        if (c2a72 != null) {
            c2a72.setText(C15380j0.LJIILL(R.string.ndo, 5));
        }
        C2A7 c2a73 = this.LJLLI;
        if (c2a73 != null) {
            c2a73.setText(C15380j0.LJIILL(R.string.ndo, 10));
        }
        C2A7 c2a74 = this.LJLLILLLL;
        if (c2a74 != null) {
            c2a74.setText(C15380j0.LJIILL(R.string.ndo, 15));
        }
        C2A7 c2a75 = this.LJLLJ;
        if (c2a75 != null) {
            c2a75.setText(C15380j0.LJIILL(R.string.ndo, 20));
        }
        HashMap<Integer, ImageView> hashMap = this.LLFF;
        hashMap.put(3, this.LJLLLL);
        hashMap.put(5, this.LJLLLLLL);
        hashMap.put(10, this.LJLZ);
        hashMap.put(15, this.LJZ);
        hashMap.put(20, this.LJZI);
        hashMap.put(0, this.LJZL);
        HashMap<Integer, C2A7> hashMap2 = this.LLFFF;
        hashMap2.put(3, this.LJLJLLL);
        hashMap2.put(5, this.LJLL);
        hashMap2.put(10, this.LJLLI);
        hashMap2.put(15, this.LJLLILLLL);
        hashMap2.put(20, this.LJLLJ);
        hashMap2.put(0, this.LJLLL);
        LiveIconView liveIconView = this.LJLJL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 181));
        }
        ShowConfig showConfig = this.LJLJJLL;
        if (showConfig != null) {
            int i = (int) (showConfig.durationPerGuest / 60);
            if (this.LLFF.get(Integer.valueOf(i)) != null) {
                LJJIIZ(i);
            } else {
                C2A7 c2a76 = this.LJLLL;
                if (c2a76 != null) {
                    c2a76.setText(C15380j0.LJIILL(R.string.ndo, Integer.valueOf(i)));
                }
                this.LL = i;
                LJJIIZ(0);
            }
        }
        LJJIIZI(this.LJLJLLL, 3);
        LJJIIZI(this.LJLL, 5);
        LJJIIZI(this.LJLLI, 10);
        LJJIIZI(this.LJLLILLLL, 15);
        LJJIIZI(this.LJLLJ, 20);
        LJJIIZI(this.LJLLL, 0);
        C41071jL c41071jL = this.LJLJLJ;
        Boolean bool2 = null;
        if (c41071jL != null) {
            ShowConfig showConfig2 = this.LJLJJLL;
            if (showConfig2 != null) {
                bool = Boolean.valueOf(showConfig2.allowOpenMicFreely);
            } else {
                bool = null;
            }
            c41071jL.setChecked(C29306Beo.LJJIFFI(bool));
            this.LLF = c41071jL.isChecked();
            c41071jL.setOnCheckedChangeListener(new IDCListenerS143S0200000_13(c41071jL, this, 1));
        }
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            bool2 = Boolean.valueOf(LIZ.LJIIJJI());
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            C2A7 c2a77 = this.LJLJLLL;
            if (c2a77 != null) {
                c2a77.setEnabled(false);
            }
            C2A7 c2a78 = this.LJLL;
            if (c2a78 != null) {
                c2a78.setEnabled(false);
            }
            C2A7 c2a79 = this.LJLLI;
            if (c2a79 != null) {
                c2a79.setEnabled(false);
            }
            C2A7 c2a710 = this.LJLLILLLL;
            if (c2a710 != null) {
                c2a710.setEnabled(false);
            }
            C2A7 c2a711 = this.LJLLJ;
            if (c2a711 != null) {
                c2a711.setEnabled(false);
            }
            C2A7 c2a712 = this.LJLLL;
            if (c2a712 == null) {
                return;
            }
            c2a712.setEnabled(false);
        }
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        UHL uhl = this.LLFII;
        if (uhl != null) {
            C29306Beo.LJJJJ(uhl);
        }
    }

    public final void LJJIIZ(int i) {
        Boolean bool;
        C2A7 c2a7;
        Integer LJI;
        C2A7 c2a72;
        int i2;
        Integer LJI2;
        ImageView imageView = this.LLFF.get(Integer.valueOf(this.LLD));
        if (imageView != null) {
            C87277YNd.LJJIIZI(imageView);
        }
        U35 LIZ = TQA.LIZ();
        Boolean bool2 = null;
        if (LIZ != null) {
            bool = Boolean.valueOf(LIZ.LJIIJJI());
        } else {
            bool = null;
        }
        int i3 = 0;
        if (!C29306Beo.LJJIFFI(bool) && (c2a72 = this.LLFFF.get(Integer.valueOf(this.LLD))) != null) {
            Context context = getContext();
            if (context != null && (LJI2 = C79045V0n.LJI(R.attr.gu, context)) != null) {
                i2 = LJI2.intValue();
            } else {
                i2 = 0;
            }
            c2a72.setTextColor(i2);
        }
        ImageView imageView2 = this.LLFF.get(Integer.valueOf(i));
        if (imageView2 != null) {
            C87277YNd.LJJIJ(imageView2);
        }
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null) {
            bool2 = Boolean.valueOf(LIZ2.LJIIJJI());
        }
        if (!C29306Beo.LJJIFFI(bool2) && (c2a7 = this.LLFFF.get(Integer.valueOf(i))) != null) {
            Context context2 = getContext();
            if (context2 != null && (LJI = C79045V0n.LJI(R.attr.go, context2)) != null) {
                i3 = LJI.intValue();
            }
            c2a7.setTextColor(i3);
        }
        this.LLD = i;
        LJJIJ();
    }

    public final void LJJIIZI(C2A7 c2a7, int i) {
        Boolean bool;
        int i2;
        Integer LJI;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            bool = Boolean.valueOf(LIZ.LJIIJJI());
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            if (c2a7 != null) {
                Context context = getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.gu, context)) != null) {
                    i2 = LJI.intValue();
                } else {
                    i2 = 0;
                }
                c2a7.setTextColor(i2);
            } else {
                return;
            }
        } else if (c2a7 == null) {
            return;
        }
        C16880lQ.LJJIII(c2a7, new ACListenerS30S0101000_13(i, this, 7));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3D(Context context, U3A listener, ShowConfig showConfig) {
        super(context, 4);
        boolean z;
        o.LJIIIZ(listener, "listener");
        this.LJLJJL = listener;
        this.LJLJJLL = showConfig;
        this.LL = 5;
        this.LLD = 5;
        this.LLFF = new HashMap<>();
        this.LLFFF = new HashMap<>();
        if (showConfig != null) {
            Long valueOf = Long.valueOf(showConfig.durationPerGuest);
            if (valueOf != null) {
                this.LLD = (int) (valueOf.longValue() / 60);
            }
            if (showConfig != null) {
                z = showConfig.allowOpenMicFreely;
                this.LLF = z;
            }
        }
        z = false;
        this.LLF = z;
    }
}
