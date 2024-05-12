package Y;

import X.C76762UAs;
import X.U66;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S3400200_13 implements Runnable {
    public final int $t;
    public long j7;
    public long j8;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        U66 u66 = (U66) this.l3;
        long j = this.j7;
        long j2 = this.j8;
        JSONObject jSONObject = (JSONObject) this.l4;
        JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
        String str = this.s0;
        String str2 = this.s1;
        Boolean bool = (Boolean) this.l6;
        String str3 = this.s2;
        LJIIZILJ.put("api_name", str);
        LJIIZILJ.put("source", str2);
        if (bool != null) {
            bool.booleanValue();
            LJIIZILJ.put("mute", bool.booleanValue());
        }
        if (str3 != null) {
            LJIIZILJ.put("ext_msg", str3);
        }
        UC0.LJJJJJL(u66, j, j2, jSONObject, "on_video_api_call", LJIIZILJ, ((C76762UAs) this.l5).LIZIZ.LIZLLL((U66) this.l3), ((C76762UAs) this.l5).LIZJ);
    }

    public final void LIZ$1() {
        U66 u66 = (U66) this.l3;
        long j = this.j7;
        long j2 = this.j8;
        JSONObject jSONObject = (JSONObject) this.l4;
        JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
        String str = this.s0;
        String str2 = this.s1;
        Boolean bool = (Boolean) this.l6;
        String str3 = this.s2;
        LJIIZILJ.put("api_name", str);
        LJIIZILJ.put("source", str2);
        if (bool != null) {
            bool.booleanValue();
            LJIIZILJ.put("mute", bool.booleanValue());
        }
        if (str3 != null) {
            LJIIZILJ.put("ext_msg", str3);
        }
        UC0.LJJJJJL(u66, j, j2, jSONObject, "on_audio_api_call", LJIIZILJ, ((C76762UAs) this.l5).LIZIZ.LIZLLL((U66) this.l3), ((C76762UAs) this.l5).LIZJ);
    }

    public static final void run$0(ARunnableS0S3400200_13 aRunnableS0S3400200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3400200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3400200_13 aRunnableS0S3400200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3400200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3400200_13(U66 u66, long j, long j2, JSONObject jSONObject, C76762UAs c76762UAs, String str, String str2, Boolean bool, String str3, int i) {
        this.$t = i;
        this.l3 = u66;
        this.j7 = j;
        this.j8 = j2;
        this.l4 = jSONObject;
        this.l5 = c76762UAs;
        this.s0 = str;
        this.s1 = str2;
        this.l6 = bool;
        this.s2 = str3;
    }
}
