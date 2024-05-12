package X;

import Y.ARunnableS44S0100000_8;
import android.os.SystemClock;
import android.util.Printer;
import com.ss.android.common.lib.AppLogNewUtils;
import java.lang.reflect.Field;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ILX {
    public byte LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LJIILJJIL;
    public String LIZ = "null";
    public String LIZIZ = "null";
    public String LIZJ = "null";
    public final long[] LJI = new long[ILW.values().length];
    public final long[] LJII = new long[ILW.values().length];
    public Printer LJIIIIZZ = null;
    public ILZ LJIIIZ = null;
    public boolean LJIIJ = false;
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public byte LJIILIIL = -1;
    public int LJIILL = 0;
    public int LJIILLIIL = 0;
    public int LJIIZILJ = 0;
    public int LJIJ = 0;
    public int LJIJI = 0;
    public int LJIJJ = 0;

    public final void LJ() {
        int i = 0;
        this.LJIIL = false;
        C37179EiV.LJFF.postDelayed(new ARunnableS44S0100000_8(this, 98), 300L);
        if (!LIZJ() || !this.LJIIJJI || !this.LJ) {
            return;
        }
        if (this.LJIIJ) {
            C16880lQ.LLJJJJ().setMessageLogging(this.LJIIIIZZ);
        }
        C35810E3q.LJIIIIZZ();
        this.LJFF = false;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        final long[] jArr = new long[ILW.values().length];
        final String str = this.LIZ;
        final String str2 = this.LIZIZ;
        final String str3 = this.LIZJ;
        final int i2 = this.LJIILL;
        final int i3 = this.LJIJ;
        final int i4 = this.LJIIZILJ;
        final int i5 = this.LJIILLIIL;
        while (true) {
            long[] jArr2 = this.LJII;
            if (i < jArr2.length) {
                jArr[i] = jArr2[i];
                i++;
            } else {
                FMX.LIZIZ().execute(new Runnable() { // from class: X.ILY
                    @Override // java.lang.Runnable
                    public final void run() {
                        ILX ilx = ILX.this;
                        long[] jArr3 = jArr;
                        String str4 = str;
                        String str5 = str3;
                        String str6 = str2;
                        int i6 = i2;
                        int i7 = i3;
                        int i8 = i4;
                        int i9 = i5;
                        ilx.getClass();
                        JSONObject jSONObject = new JSONObject();
                        for (int i10 = 0; i10 < jArr3.length; i10++) {
                            try {
                                jSONObject.put(ILW.values()[i10].getType(), jArr3[i10]);
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        jSONObject.put("ui_scene", str4);
                        jSONObject.put("current_video", str5);
                        jSONObject.put("next_video", str6);
                        jSONObject.put("count", i6);
                        jSONObject.put("count3", i7);
                        jSONObject.put("count7", i8);
                        jSONObject.put("count14", i9);
                        jSONObject.put("component_listener_size", ilx.LJIJI);
                        jSONObject.put("viewpager_listener_size", ilx.LJIJJ);
                        jSONObject.put("is_new_user", C36152EGu.LJ);
                        AppLogNewUtils.onEventV3("prf_feed_scroll_time", jSONObject);
                    }
                });
                return;
            }
        }
    }

    public final boolean LIZJ() {
        int i;
        if (this.LIZLLL == -1) {
            if (C35810E3q.LJIIIIZZ() || (DST.LIZ && new Random().nextFloat() < 0.005f)) {
                i = 1;
            } else {
                i = 0;
            }
            this.LIZLLL = (byte) i;
        }
        if (this.LIZLLL != 1) {
            return false;
        }
        return true;
    }

    public final void LJFF() {
        if (!LIZJ() || !this.LJIIJJI) {
            return;
        }
        this.LJII[ILW.PAGE_SELECT_VIEWPAGER_TOTAL.ordinal()] = 0;
        this.LJII[ILW.PAGE_SELECT_COMPONENT_TOTAL.ordinal()] = 0;
        this.LJII[ILW.PAGE_SELECT_INTERNAL_TOTAL.ordinal()] = 0;
        this.LJII[ILW.PAGE_SELECT_BEFORE.ordinal()] = 0;
        this.LJII[ILW.PAGE_SELECT_INVOKE_SELECT.ordinal()] = 0;
        this.LJII[ILW.PAGE_SELECT_PLAYER.ordinal()] = 0;
        this.LJII[ILW.PAGE_SELECT_AFTER.ordinal()] = 0;
        this.LJII[ILW.PLAYER_PAUSE.ordinal()] = 0;
        this.LJII[ILW.PLAYER_PREPARE.ordinal()] = 0;
        this.LJII[ILW.PLAYER_STOP.ordinal()] = 0;
        this.LJII[ILW.PLAYER_RENDER_READY.ordinal()] = 0;
        this.LJII[ILW.PLAYER_RENDER_FIRST.ordinal()] = 0;
        this.LJII[ILW.PLAYER_RENDER_FIRST_DELAY.ordinal()] = 0;
        this.LJIJI = -1;
        this.LJIJJ = -1;
        this.LJ = false;
        this.LJIILL = -1;
        this.LJIJ = -1;
        this.LJIIZILJ = -1;
        this.LJIILLIIL = -1;
        if (this.LJIIJ) {
            if (this.LJIIIZ != null) {
                C16880lQ.LLJJJJ().setMessageLogging(this.LJIIIZ);
            }
            this.LJIILL = 0;
            this.LJIILLIIL = 0;
            this.LJIIZILJ = 0;
            this.LJIJ = 0;
            this.LJIILJJIL = 0L;
            this.LJIJJ = 0;
            this.LJIJI = 0;
            this.LJFF = true;
        }
        this.LJIIL = true;
    }

    public static Object LIZLLL(Object obj) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(obj.getClass(), "mLogging");
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final void LIZ(ILW ilw) {
        if (!LIZJ() || !this.LJIIJJI) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!LIZJ() || !this.LJIIJJI) {
            return;
        }
        this.LJI[ilw.ordinal()] = uptimeMillis;
    }

    public final void LIZIZ(ILW ilw) {
        if (!LIZJ() || !this.LJIIJJI) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!LIZJ() || !this.LJIIJJI) {
            return;
        }
        Long valueOf = Long.valueOf(this.LJI[ilw.ordinal()]);
        if (valueOf == null) {
            this.LJI[ilw.ordinal()] = 0;
            this.LJII[ilw.ordinal()] = 0;
        } else {
            long longValue = uptimeMillis - valueOf.longValue();
            this.LJI[ilw.ordinal()] = longValue;
            this.LJII[ilw.ordinal()] = longValue;
        }
    }
}
