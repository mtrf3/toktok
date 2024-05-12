package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.model.ByteAudioConfig;

/* renamed from: X.0gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14080gu {
    public final Context LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public Intent LJIIZILJ;
    public ByteAudioConfig LJIJJ;
    public InterfaceC15340iw LJIJJLI;
    public int LJIL;
    public String LJJ;
    public float LJJI;
    public boolean LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZI;
    public InterfaceC15330iv LJJIJ;
    public InterfaceC17160ls LJJIJIIJI;
    public AssetManager LJJIJIIJIL;
    public String LJJIJIL;
    public Object LJJIJL;
    public boolean LJJIJLIJ;
    public int LJJIL;
    public int LJJIZ;
    public String LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public int LJIJ = -1;
    public int LJIJI = -1;
    public boolean LJJIIZ = true;
    public int LJJJ = 2;
    public boolean LJJJJIZL = true;
    public int LJJJJJ = -1;

    public final C14090gv LIZ() {
        boolean z;
        String str;
        int min;
        String str2;
        int i = 1;
        if (LiveAbLabelSetting.INSTANCE.getIntValue("opt_up_sample") == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.LIZLLL;
        if (i2 == 0) {
            i2 = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        this.LIZLLL = i2;
        int i3 = this.LJ;
        if (i3 == 0) {
            i3 = 200;
        }
        this.LJ = i3;
        int i4 = this.LJFF;
        if (i4 == 0) {
            i4 = 800;
        }
        this.LJFF = i4;
        int i5 = this.LJIIIZ;
        if (i5 == 0) {
            if (z) {
                i5 = 480;
            } else {
                i5 = 360;
            }
        }
        this.LJIIIZ = i5;
        int i6 = this.LJIIJ;
        if (i6 == 0) {
            if (z) {
                i6 = 864;
            } else {
                i6 = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
            }
        }
        this.LJIIJ = i6;
        int i7 = this.LJI;
        if (i7 == 0) {
            i7 = 15;
        }
        this.LJI = i7;
        int i8 = this.LJIILIIL;
        if (i8 == 0) {
            i8 = 9;
        }
        this.LJIILIIL = i8;
        long j = this.LJIILJJIL;
        if (j == 0) {
            j = 60000;
        }
        this.LJIILJJIL = j;
        int i9 = this.LJIILL;
        if (i9 == 0) {
            i9 = 44100;
        }
        this.LJIILL = i9;
        int i10 = 2;
        if (this.LJIILLIIL != 2) {
            i10 = 1;
        }
        this.LJIILLIIL = i10;
        String str3 = "";
        if (TextUtils.isEmpty(this.LIZIZ)) {
            str = "";
        } else {
            str = this.LIZIZ;
        }
        this.LIZIZ = str;
        int i11 = this.LJIIL;
        if (i11 == 0) {
            min = 1;
        } else {
            min = Math.min(i11, 3);
        }
        this.LJIIL = min;
        int i12 = this.LJIJ;
        if (i12 == -1) {
            i12 = 4;
        }
        this.LJIJ = i12;
        int i13 = this.LJIJI;
        if (i13 == -1) {
            i13 = 1;
        }
        this.LJIJI = i13;
        if ("".equals(this.LJJ)) {
            str2 = "live-stream-sdk";
        } else {
            str2 = this.LJJ;
        }
        this.LJJ = str2;
        int i14 = this.LJJII;
        if (i14 != 0) {
            i = i14;
        }
        this.LJJII = i;
        float f = this.LJJI;
        if (f == 0.0f) {
            f = 2.0f;
        }
        this.LJJI = f;
        String str4 = this.LJJIIZI;
        if (str4 == null) {
            str4 = "";
        }
        this.LJJIIZI = str4;
        String str5 = this.LJJIIJZLJL;
        if (str5 != null) {
            str3 = str5;
        }
        this.LJJIIJZLJL = str3;
        return new C14090gv(this);
    }

    public C14080gu(Context context) {
        this.LIZ = context;
    }
}
