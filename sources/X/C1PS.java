package X;

import Y.IDd0S16S0000000;
import android.database.Cursor;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1PS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PS implements InterfaceC09770Zx {
    public final AbstractC03300Ba LIZ;
    public final C42291lJ LIZIZ;
    public final C05140Ic LIZJ = new C05140Ic();
    public final IDd0S16S0000000 LIZLLL;

    @Override // X.InterfaceC09770Zx
    public final void LIZ() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC09770Zx
    public final List<SoundEffect> getAll() {
        ImageModel imageModel;
        String string;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ImageModel imageModel2;
        String string2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String string3;
        String string4;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM sound_effect_database");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "dbId");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "id");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "name");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "eng_name");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "version");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "resource_urlavg_color");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "resource_urluri");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "resource_urlurl_list");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "resource_urlopen_web_url");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "resource_urlimage_type");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "resource_urlis_animated");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "resource_urlwidth");
            try {
                int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "resource_urlheight");
                int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "resource_urlisLoaded");
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "resource_urlisMonitored");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "resource_urlisFeedCandidate");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "iconavg_color");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "iconuri");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "iconurl_list");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "iconopen_web_url");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "iconimage_type");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "iconis_animated");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "iconwidth");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "iconheight");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "iconisLoaded");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "iconisMonitored");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "iconisFeedCandidate");
                ArrayList arrayList = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    if (!LIZIZ.isNull(LIZIZ7) || !LIZIZ.isNull(LIZIZ8) || !LIZIZ.isNull(LIZIZ9) || !LIZIZ.isNull(LIZIZ10) || !LIZIZ.isNull(LIZIZ11) || !LIZIZ.isNull(LIZIZ12) || !LIZIZ.isNull(LIZIZ13) || !LIZIZ.isNull(LIZIZ14) || !LIZIZ.isNull(LIZIZ15) || !LIZIZ.isNull(LIZIZ16) || !LIZIZ.isNull(LIZIZ17)) {
                        imageModel = new ImageModel();
                        if (LIZIZ.isNull(LIZIZ7)) {
                            imageModel.avgColor = null;
                        } else {
                            imageModel.avgColor = LIZIZ.getString(LIZIZ7);
                        }
                        if (LIZIZ.isNull(LIZIZ8)) {
                            imageModel.mUri = null;
                        } else {
                            imageModel.mUri = LIZIZ.getString(LIZIZ8);
                        }
                        if (LIZIZ.isNull(LIZIZ9)) {
                            string = null;
                        } else {
                            string = LIZIZ.getString(LIZIZ9);
                        }
                        this.LIZJ.getClass();
                        imageModel.mUrls = C05140Ic.LIZ(string);
                        if (LIZIZ.isNull(LIZIZ10)) {
                            imageModel.schema = null;
                        } else {
                            imageModel.schema = LIZIZ.getString(LIZIZ10);
                        }
                        imageModel.setImageType(LIZIZ.getInt(LIZIZ11));
                        if (LIZIZ.getInt(LIZIZ12) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        imageModel.setAnimated(z);
                        imageModel.width = LIZIZ.getInt(LIZIZ13);
                        imageModel.height = LIZIZ.getInt(LIZIZ14);
                        if (LIZIZ.getInt(LIZIZ15) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        imageModel.setLoaded(z2);
                        if (LIZIZ.getInt(LIZIZ16) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        imageModel.setMonitored(z3);
                        if (LIZIZ.getInt(LIZIZ17) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        imageModel.setFeedCandidate(z4);
                    } else {
                        imageModel = null;
                    }
                    if (!LIZIZ.isNull(LIZIZ18) || !LIZIZ.isNull(LIZIZ19) || !LIZIZ.isNull(LIZIZ20) || !LIZIZ.isNull(LIZIZ21) || !LIZIZ.isNull(LIZIZ22) || !LIZIZ.isNull(LIZIZ23) || !LIZIZ.isNull(LIZIZ24) || !LIZIZ.isNull(LIZIZ25) || !LIZIZ.isNull(LIZIZ26) || !LIZIZ.isNull(LIZIZ27) || !LIZIZ.isNull(LIZIZ28)) {
                        imageModel2 = new ImageModel();
                        if (LIZIZ.isNull(LIZIZ18)) {
                            imageModel2.avgColor = null;
                        } else {
                            imageModel2.avgColor = LIZIZ.getString(LIZIZ18);
                        }
                        if (LIZIZ.isNull(LIZIZ19)) {
                            imageModel2.mUri = null;
                        } else {
                            imageModel2.mUri = LIZIZ.getString(LIZIZ19);
                        }
                        if (LIZIZ.isNull(LIZIZ20)) {
                            string2 = null;
                        } else {
                            string2 = LIZIZ.getString(LIZIZ20);
                        }
                        this.LIZJ.getClass();
                        imageModel2.mUrls = C05140Ic.LIZ(string2);
                        if (LIZIZ.isNull(LIZIZ21)) {
                            imageModel2.schema = null;
                        } else {
                            imageModel2.schema = LIZIZ.getString(LIZIZ21);
                        }
                        imageModel2.setImageType(LIZIZ.getInt(LIZIZ22));
                        if (LIZIZ.getInt(LIZIZ23) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        imageModel2.setAnimated(z5);
                        imageModel2.width = LIZIZ.getInt(LIZIZ24);
                        imageModel2.height = LIZIZ.getInt(LIZIZ25);
                        if (LIZIZ.getInt(LIZIZ26) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        imageModel2.setLoaded(z6);
                        if (LIZIZ.getInt(LIZIZ27) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        imageModel2.setMonitored(z7);
                        if (LIZIZ.getInt(LIZIZ28) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        imageModel2.setFeedCandidate(z8);
                    } else {
                        imageModel2 = null;
                    }
                    SoundEffect soundEffect = new SoundEffect();
                    soundEffect.LIZ = LIZIZ.getInt(LIZIZ2);
                    soundEffect.id = LIZIZ.getLong(LIZIZ3);
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    o.LJIIIZ(string3, "<set-?>");
                    soundEffect.name = string3;
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    o.LJIIIZ(string4, "<set-?>");
                    soundEffect.nameEn = string4;
                    soundEffect.version = LIZIZ.getLong(LIZIZ6);
                    soundEffect.resourceUrl = imageModel;
                    soundEffect.iconUrl = imageModel2;
                    arrayList.add(soundEffect);
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1lJ] */
    public C1PS(final SoundEffectDatabase soundEffectDatabase) {
        this.LIZ = soundEffectDatabase;
        this.LIZIZ = new C1CG<SoundEffect>(soundEffectDatabase) { // from class: X.1lJ
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `sound_effect_database` (`dbId`,`id`,`name`,`eng_name`,`version`,`resource_urlavg_color`,`resource_urluri`,`resource_urlurl_list`,`resource_urlopen_web_url`,`resource_urlimage_type`,`resource_urlis_animated`,`resource_urlwidth`,`resource_urlheight`,`resource_urlisLoaded`,`resource_urlisMonitored`,`resource_urlisFeedCandidate`,`iconavg_color`,`iconuri`,`iconurl_list`,`iconopen_web_url`,`iconimage_type`,`iconis_animated`,`iconwidth`,`iconheight`,`iconisLoaded`,`iconisMonitored`,`iconisFeedCandidate`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, SoundEffect soundEffect) {
                SoundEffect soundEffect2 = soundEffect;
                interfaceC37591dj.LJIIIZ(1, soundEffect2.LIZ);
                interfaceC37591dj.LJIIIZ(2, soundEffect2.id);
                String str = soundEffect2.name;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(3);
                } else {
                    interfaceC37591dj.LJJII(3, str);
                }
                String str2 = soundEffect2.nameEn;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(4);
                } else {
                    interfaceC37591dj.LJJII(4, str2);
                }
                interfaceC37591dj.LJIIIZ(5, soundEffect2.version);
                ImageModel imageModel = soundEffect2.resourceUrl;
                if (imageModel != null) {
                    String str3 = imageModel.avgColor;
                    if (str3 == null) {
                        interfaceC37591dj.LLLLLLJ(6);
                    } else {
                        interfaceC37591dj.LJJII(6, str3);
                    }
                    String str4 = imageModel.mUri;
                    if (str4 == null) {
                        interfaceC37591dj.LLLLLLJ(7);
                    } else {
                        interfaceC37591dj.LJJII(7, str4);
                    }
                    C05140Ic c05140Ic = C1PS.this.LIZJ;
                    List<String> list = imageModel.mUrls;
                    c05140Ic.getClass();
                    o.LJIIIZ(list, "list");
                    String json = GsonProtectorUtils.toJson(new Gson(), list);
                    o.LJIIIIZZ(json, "gson.toJson(list)");
                    interfaceC37591dj.LJJII(8, json);
                    String str5 = imageModel.schema;
                    if (str5 == null) {
                        interfaceC37591dj.LLLLLLJ(9);
                    } else {
                        interfaceC37591dj.LJJII(9, str5);
                    }
                    interfaceC37591dj.LJIIIZ(10, imageModel.getImageType());
                    interfaceC37591dj.LJIIIZ(11, imageModel.isAnimated() ? 1L : 0L);
                    interfaceC37591dj.LJIIIZ(12, imageModel.width);
                    interfaceC37591dj.LJIIIZ(13, imageModel.height);
                    interfaceC37591dj.LJIIIZ(14, imageModel.isLoaded() ? 1L : 0L);
                    interfaceC37591dj.LJIIIZ(15, imageModel.isMonitored() ? 1L : 0L);
                    interfaceC37591dj.LJIIIZ(16, imageModel.isFeedCandidate() ? 1L : 0L);
                } else {
                    interfaceC37591dj.LLLLLLJ(6);
                    interfaceC37591dj.LLLLLLJ(7);
                    interfaceC37591dj.LLLLLLJ(8);
                    interfaceC37591dj.LLLLLLJ(9);
                    interfaceC37591dj.LLLLLLJ(10);
                    interfaceC37591dj.LLLLLLJ(11);
                    interfaceC37591dj.LLLLLLJ(12);
                    interfaceC37591dj.LLLLLLJ(13);
                    interfaceC37591dj.LLLLLLJ(14);
                    interfaceC37591dj.LLLLLLJ(15);
                    interfaceC37591dj.LLLLLLJ(16);
                }
                ImageModel imageModel2 = soundEffect2.iconUrl;
                if (imageModel2 != null) {
                    String str6 = imageModel2.avgColor;
                    if (str6 == null) {
                        interfaceC37591dj.LLLLLLJ(17);
                    } else {
                        interfaceC37591dj.LJJII(17, str6);
                    }
                    String str7 = imageModel2.mUri;
                    if (str7 == null) {
                        interfaceC37591dj.LLLLLLJ(18);
                    } else {
                        interfaceC37591dj.LJJII(18, str7);
                    }
                    C05140Ic c05140Ic2 = C1PS.this.LIZJ;
                    List<String> list2 = imageModel2.mUrls;
                    c05140Ic2.getClass();
                    o.LJIIIZ(list2, "list");
                    String json2 = GsonProtectorUtils.toJson(new Gson(), list2);
                    o.LJIIIIZZ(json2, "gson.toJson(list)");
                    interfaceC37591dj.LJJII(19, json2);
                    String str8 = imageModel2.schema;
                    if (str8 == null) {
                        interfaceC37591dj.LLLLLLJ(20);
                    } else {
                        interfaceC37591dj.LJJII(20, str8);
                    }
                    interfaceC37591dj.LJIIIZ(21, imageModel2.getImageType());
                    interfaceC37591dj.LJIIIZ(22, imageModel2.isAnimated() ? 1L : 0L);
                    interfaceC37591dj.LJIIIZ(23, imageModel2.width);
                    interfaceC37591dj.LJIIIZ(24, imageModel2.height);
                    interfaceC37591dj.LJIIIZ(25, imageModel2.isLoaded() ? 1L : 0L);
                    interfaceC37591dj.LJIIIZ(26, imageModel2.isMonitored() ? 1L : 0L);
                    interfaceC37591dj.LJIIIZ(27, imageModel2.isFeedCandidate() ? 1L : 0L);
                    return;
                }
                interfaceC37591dj.LLLLLLJ(17);
                interfaceC37591dj.LLLLLLJ(18);
                interfaceC37591dj.LLLLLLJ(19);
                interfaceC37591dj.LLLLLLJ(20);
                interfaceC37591dj.LLLLLLJ(21);
                interfaceC37591dj.LLLLLLJ(22);
                interfaceC37591dj.LLLLLLJ(23);
                interfaceC37591dj.LLLLLLJ(24);
                interfaceC37591dj.LLLLLLJ(25);
                interfaceC37591dj.LLLLLLJ(26);
                interfaceC37591dj.LLLLLLJ(27);
            }
        };
        this.LIZLLL = new IDd0S16S0000000(soundEffectDatabase, 0);
    }

    @Override // X.InterfaceC09770Zx
    public final void LIZIZ(List<SoundEffect> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }
}
