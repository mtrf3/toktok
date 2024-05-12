package X;

import Y.ACallableS34S1100000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Hwe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45700Hwe extends AbstractC029409q<C45703Hwh> {
    public final boolean LJLIL;
    public final float LJLILLLLZI;
    public final int LJLJI;
    public MyMediaModel LJLJJI;
    public final C45584Hum<String> LJLJJL;
    public final Context LJLJJLL;
    public final C37344ElA LJLJL;
    public final VEMediaParserProviderV2 LJLJLJ;
    public final java.util.Set<MyMediaModel> LJLJLLL;

    public C45700Hwe() {
        throw null;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI;
    }

    public final void LJLLLLLL(MyMediaModel myMediaModel) {
        String str;
        Bitmap LJLZ = LJLZ(myMediaModel.fileLocalUriPath);
        if ((LJLZ == null || LJLZ.isRecycled()) && (str = myMediaModel.fileLocalUriPath) != null && C78685UuP.LJJJZ(str) && C44687HgJ.LIZIZ(str)) {
            C10K.LIZJ(new ACallableS34S1100000_7(this, str, 1));
        }
    }

    public final Bitmap LJLZ(String str) {
        Bitmap bitmap;
        if (str == null) {
            return null;
        }
        synchronized (this.LJLJL) {
            bitmap = this.LJLJL.get(str);
        }
        return bitmap;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.LJLIL) {
            return 2;
        }
        if (i == 0) {
            return 0;
        }
        if (i != this.LJLJI - 1) {
            return 2;
        }
        return 1;
    }

    public final void LJZ(int i, int i2) {
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        while (true) {
            if ((i2 > 512 || i > 512) && (i3 = i2 >> 1) >= 64 && (i4 = i >> 1) >= 64) {
                i2 = i3;
                i = i4;
            }
        }
        VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LJLJLJ;
        vEMediaParserProviderV2.LJLJLJ = i;
        vEMediaParserProviderV2.LJLJLLL = i2;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C45703Hwh c45703Hwh, int i) {
        String str;
        long j;
        String str2;
        C45703Hwh holder = c45703Hwh;
        o.LJIIIZ(holder, "holder");
        MyMediaModel myMediaModel = this.LJLJJI;
        if (myMediaModel != null) {
            LJZ(myMediaModel.width, myMediaModel.height);
        }
        if (i == 0) {
            VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LJLJLJ;
            if (vEMediaParserProviderV2.LJLILLLLZI.size() > 8) {
                vEMediaParserProviderV2.LIZLLL();
            }
        }
        String str3 = null;
        if (this.LJLIL) {
            MyMediaModel myMediaModel2 = this.LJLJJI;
            if (myMediaModel2 != null) {
                str3 = myMediaModel2.fileLocalUriPath;
            }
            Bitmap LJLZ = LJLZ(str3);
            if (LJLZ != null && !LJLZ.isRecycled()) {
                holder.LJLILLLLZI.setImageBitmap(LJLZ);
            } else {
                MyMediaModel myMediaModel3 = this.LJLJJI;
                if (myMediaModel3 != null && (str2 = myMediaModel3.fileLocalUriPath) != null && C78685UuP.LJJJZ(str2) && C44687HgJ.LIZIZ(str2)) {
                    C78764Uvg.LJIIJ(holder.LJLILLLLZI, C44694HgQ.LJIIIIZZ(str2).toString(), (int) this.LJLILLLLZI, SFS.LJI(48.0d), Bitmap.Config.ARGB_8888, null, null);
                }
            }
        } else {
            MyMediaModel myMediaModel4 = this.LJLJJI;
            if (myMediaModel4 != null && (str = myMediaModel4.fileLocalUriPath) != null && C78685UuP.LJJJZ(str) && C44687HgJ.LIZIZ(str)) {
                C78764Uvg.LJIIIZ(holder.LJLILLLLZI, C44694HgQ.LJIIIIZZ(str).toString(), -1, -1);
            }
        }
        MyMediaModel myMediaModel5 = this.LJLJJI;
        if (myMediaModel5 != null) {
            C45584Hum<String> c45584Hum = this.LJLJJL;
            if (c45584Hum != null) {
                String str4 = myMediaModel5.id;
                o.LJIIIIZZ(str4, "it.id");
                MediaModel mediaModel = (MediaModel) ((LinkedHashMap) c45584Hum.LIZ).get(str4);
                if (mediaModel != null) {
                    j = mediaModel.duration;
                    float f = (i / this.LJLJI) * ((float) j);
                    StringBuilder sb = new StringBuilder();
                    sb.append(myMediaModel5.fileLocalUriPath);
                    int i2 = (int) f;
                    sb.append(i2);
                    holder.LJLILLLLZI.setTag(sb.toString());
                    VEMediaParserProviderV2 vEMediaParserProviderV22 = this.LJLJLJ;
                    String str5 = myMediaModel5.fileLocalUriPath;
                    o.LJIIIIZZ(str5, "it.fileLocalUriPath");
                    vEMediaParserProviderV22.LIZIZ(i, str5, i2, new C45701Hwf(myMediaModel5, f, holder, this));
                }
            }
            j = myMediaModel5.duration;
            float f2 = (i / this.LJLJI) * ((float) j);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(myMediaModel5.fileLocalUriPath);
            int i22 = (int) f2;
            sb2.append(i22);
            holder.LJLILLLLZI.setTag(sb2.toString());
            VEMediaParserProviderV2 vEMediaParserProviderV222 = this.LJLJLJ;
            String str52 = myMediaModel5.fileLocalUriPath;
            o.LJIIIIZZ(str52, "it.fileLocalUriPath");
            vEMediaParserProviderV222.LIZIZ(i, str52, i22, new C45701Hwf(myMediaModel5, f2, holder, this));
        }
    }

    @Override // X.AbstractC029409q
    public final C45703Hwh onCreateViewHolder(ViewGroup parent, int i) {
        ImageView.ScaleType scaleType;
        String str;
        int i2;
        Drawable LIZ;
        String str2;
        o.LJIIIZ(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(this.LJLJJLL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.LJLILLLLZI, -1);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        SmartImageView smartImageView = new SmartImageView(this.LJLJJLL);
        smartImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (this.LJLIL) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        smartImageView.setScaleType(scaleType);
        boolean z = true;
        String str3 = null;
        if (this.LJLIL) {
            MyMediaModel myMediaModel = this.LJLJJI;
            if (myMediaModel != null) {
                str3 = myMediaModel.fileLocalUriPath;
            }
            Bitmap LJLZ = LJLZ(str3);
            if (LJLZ != null && !LJLZ.isRecycled()) {
                smartImageView.setImageBitmap(LJLZ);
            } else {
                MyMediaModel myMediaModel2 = this.LJLJJI;
                if (myMediaModel2 != null && (str2 = myMediaModel2.fileLocalUriPath) != null && C78685UuP.LJJJZ(str2) && C44687HgJ.LIZIZ(str2)) {
                    C78764Uvg.LJIIJ(smartImageView, C44694HgQ.LJIIIIZZ(str2).toString(), (int) this.LJLILLLLZI, SFS.LJI(48.0d), Bitmap.Config.RGB_565, null, null);
                }
            }
        } else {
            MyMediaModel myMediaModel3 = this.LJLJJI;
            if (myMediaModel3 != null && (str = myMediaModel3.fileLocalUriPath) != null && C78685UuP.LJJJZ(str) && C44687HgJ.LIZIZ(str)) {
                float f = this.LJLILLLLZI;
                int i3 = (int) f;
                if (this.LJLJJI != null) {
                    i2 = (int) ((f / r5.width) * r5.height);
                } else {
                    i2 = i3;
                }
                W5F LJFF = W5U.LJFF(C44694HgQ.LJIIIIZZ(str));
                LJFF.LJJIIJ = smartImageView;
                LJFF.LJIJI = Bitmap.Config.RGB_565;
                LJFF.LJIJJ = EnumC72807Shn.FIT_CENTER;
                LJFF.LJII = i3;
                LJFF.LJIIIIZZ = i2;
                LJFF.LJJIJIL = true;
                smartImageView.LIZ(LJFF.LIZ());
            }
        }
        float LJIIZILJ = C32151Nz.LJIIZILJ(2);
        if (i != 0) {
            if (i != 1) {
                if (this.LJLIL) {
                    LIZ = C04270Et.LIZIZ(this.LJLJJLL, R.drawable.a89);
                } else {
                    C110614Vt c110614Vt = new C110614Vt();
                    int LJI = C79045V0n.LJI(R.attr.d4, this.LJLJJLL);
                    if (LJI == null) {
                        LJI = -16777216;
                    }
                    c110614Vt.LIZ = LJI;
                    LIZ = c110614Vt.LIZ(this.LJLJJLL);
                }
                frameLayout.setBackground(LIZ);
            } else {
                C110614Vt c110614Vt2 = new C110614Vt();
                int LJI2 = C79045V0n.LJI(R.attr.d4, this.LJLJJLL);
                if (LJI2 == null) {
                    LJI2 = -16777216;
                }
                c110614Vt2.LIZ = LJI2;
                c110614Vt2.LJIIIZ = Float.valueOf(LJIIZILJ);
                c110614Vt2.LJIIJJI = Float.valueOf(LJIIZILJ);
                frameLayout.setBackground(c110614Vt2.LIZ(this.LJLJJLL));
            }
        } else {
            C110614Vt c110614Vt3 = new C110614Vt();
            int LJI3 = C79045V0n.LJI(R.attr.d4, this.LJLJJLL);
            if (LJI3 == null) {
                LJI3 = -16777216;
            }
            c110614Vt3.LIZ = LJI3;
            c110614Vt3.LJIIIIZZ = Float.valueOf(LJIIZILJ);
            c110614Vt3.LJIIJ = Float.valueOf(LJIIZILJ);
            frameLayout.setBackground(c110614Vt3.LIZ(this.LJLJJLL));
        }
        frameLayout.addView(smartImageView);
        C45703Hwh c45703Hwh = new C45703Hwh(frameLayout, smartImageView);
        C0AX.LIZ(parent, c45703Hwh.itemView, R.id.lj7);
        View view = c45703Hwh.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c45703Hwh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C45703Hwh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c45703Hwh.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c45703Hwh.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C45703Hwh.class.getName();
        return c45703Hwh;
    }

    public C45700Hwe(boolean z, float f, int i, C45584Hum c45584Hum, Context context, Lifecycle lifecycle, int i2) {
        this.LJLIL = (i2 & 1) != 0 ? false : z;
        this.LJLILLLLZI = f;
        this.LJLJI = i;
        this.LJLJJI = null;
        this.LJLJJL = c45584Hum;
        this.LJLJJLL = context;
        this.LJLJL = new C37344ElA();
        this.LJLJLJ = new VEMediaParserProviderV2(context, lifecycle);
        this.LJLJLLL = new LinkedHashSet();
    }
}
