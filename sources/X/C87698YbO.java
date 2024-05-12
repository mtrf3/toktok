package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import com.lynx.tasm.base.LLog;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

/* renamed from: X.YbO, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87698YbO {
    public C87714Ybe LIZ;
    public final java.util.Map<String, AbstractC87705YbV> LIZIZ = new HashMap();
    public VU5 LIZJ;

    public final VU6 LIZ() {
        EnumC87634YaM enumC87634YaM;
        EnumC87634YaM enumC87634YaM2;
        EnumC87634YaM enumC87634YaM3;
        EnumC87634YaM enumC87634YaM4;
        float f;
        EnumC87634YaM enumC87634YaM5;
        C87714Ybe c87714Ybe = this.LIZ;
        C87650Yac c87650Yac = c87714Ybe.LJIIL;
        C87650Yac c87650Yac2 = c87714Ybe.LJIILIIL;
        if (c87650Yac == null || c87650Yac.LJI() || (enumC87634YaM = c87650Yac.LJLILLLLZI) == (enumC87634YaM2 = EnumC87634YaM.percent) || enumC87634YaM == (enumC87634YaM3 = EnumC87634YaM.em) || enumC87634YaM == (enumC87634YaM4 = EnumC87634YaM.ex)) {
            return new VU6(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        VU5 vu5 = this.LIZJ;
        float LIZ = c87650Yac.LIZ(vu5.LIZIZ, vu5.LIZJ);
        if (c87650Yac2 != null) {
            if (c87650Yac2.LJI() || (enumC87634YaM5 = c87650Yac2.LJLILLLLZI) == enumC87634YaM2 || enumC87634YaM5 == enumC87634YaM3 || enumC87634YaM5 == enumC87634YaM4) {
                return new VU6(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            VU5 vu52 = this.LIZJ;
            f = c87650Yac2.LIZ(vu52.LIZIZ, vu52.LIZJ);
        } else {
            VU6 vu6 = this.LIZ.LJIIIZ;
            if (vu6 != null) {
                f = (vu6.LIZLLL * LIZ) / vu6.LIZJ;
            } else {
                f = LIZ;
            }
        }
        return new VU6(0.0f, 0.0f, LIZ, f);
    }

    public static C87698YbO LIZJ(String str) {
        return new C87696YbM().LIZJ(new ByteArrayInputStream(str.getBytes()));
    }

    public final AbstractC87705YbV LJFF(String str) {
        String substring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#") || (substring = replace.substring(1)) == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.LIZ.LIZJ)) {
            return this.LIZ;
        }
        if (((HashMap) this.LIZIZ).containsKey(substring)) {
            return (AbstractC87705YbV) ((HashMap) this.LIZIZ).get(substring);
        }
        AbstractC87705YbV LIZIZ = LIZIZ(this.LIZ, substring);
        ((HashMap) this.LIZIZ).put(substring, LIZIZ);
        return LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC87705YbV LIZIZ(InterfaceC87720Ybk interfaceC87720Ybk, String str) {
        AbstractC87705YbV LIZIZ;
        AbstractC87705YbV abstractC87705YbV = (AbstractC87705YbV) interfaceC87720Ybk;
        if (str.equals(abstractC87705YbV.LIZJ)) {
            return abstractC87705YbV;
        }
        for (Object obj : interfaceC87720Ybk.LIZ()) {
            if (obj instanceof AbstractC87705YbV) {
                AbstractC87705YbV abstractC87705YbV2 = (AbstractC87705YbV) obj;
                if (str.equals(abstractC87705YbV2.LIZJ)) {
                    return abstractC87705YbV2;
                }
                if ((obj instanceof InterfaceC87720Ybk) && (LIZIZ = LIZIZ((InterfaceC87720Ybk) obj, str)) != null) {
                    return LIZIZ;
                }
            }
        }
        return null;
    }

    public final Picture LJ(VU5 vu5, C79483VHj c79483VHj) {
        C87650Yac c87650Yac;
        VU6 vu6;
        this.LIZJ = vu5;
        C87714Ybe c87714Ybe = this.LIZ;
        if (c87714Ybe == null) {
            LLog.LIZLLL(4, "SVG", " bad format SVG, rootElement is null");
            return null;
        }
        VU6 vu62 = c87714Ybe.LJIIIZ;
        if (vu5 != null && (vu6 = vu5.LIZ) != null) {
            return LIZLLL((int) Math.ceil(vu6.LIZ + vu6.LIZJ), (int) Math.ceil(vu6.LIZIZ + vu6.LIZLLL), vu5, c79483VHj);
        }
        C87650Yac c87650Yac2 = c87714Ybe.LJIIL;
        if (c87650Yac2 != null) {
            EnumC87634YaM enumC87634YaM = c87650Yac2.LJLILLLLZI;
            EnumC87634YaM enumC87634YaM2 = EnumC87634YaM.percent;
            if (enumC87634YaM != enumC87634YaM2 && (c87650Yac = c87714Ybe.LJIILIIL) != null && c87650Yac.LJLILLLLZI != enumC87634YaM2) {
                return LIZLLL((int) Math.ceil(c87650Yac2.LIZ(vu5.LIZIZ, vu5.LIZJ)), (int) Math.ceil(this.LIZ.LJIILIIL.LIZ(vu5.LIZIZ, vu5.LIZJ)), vu5, c79483VHj);
            }
            if (vu62 != null) {
                return LIZLLL((int) Math.ceil(c87650Yac2.LIZ(vu5.LIZIZ, vu5.LIZJ)), (int) Math.ceil((vu62.LIZLLL * r1) / vu62.LIZJ), vu5, c79483VHj);
            }
        }
        C87650Yac c87650Yac3 = c87714Ybe.LJIILIIL;
        if (c87650Yac3 != null && vu62 != null) {
            return LIZLLL((int) Math.ceil((vu62.LIZJ * r2) / vu62.LIZLLL), (int) Math.ceil(c87650Yac3.LIZ(vu5.LIZIZ, vu5.LIZJ)), vu5, c79483VHj);
        }
        return LIZLLL(512, 512, vu5, c79483VHj);
    }

    public final Picture LIZLLL(int i, int i2, VU5 vu5, C79483VHj c79483VHj) {
        this.LIZJ = vu5;
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (vu5 != null) {
            if (vu5.LIZ == null) {
                vu5 = new VU5(vu5);
            }
            new C87697YbN(beginRecording, vu5.LIZIZ, c79483VHj).LJJIIJ(this, vu5);
            picture.endRecording();
            return picture;
        }
        vu5 = new VU5(14.0f, 14.0f);
        vu5.LIZ = new VU6(0.0f, 0.0f, i, i2);
        new C87697YbN(beginRecording, vu5.LIZIZ, c79483VHj).LJJIIJ(this, vu5);
        picture.endRecording();
        return picture;
    }
}
