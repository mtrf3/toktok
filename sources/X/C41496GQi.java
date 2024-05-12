package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ujb.o;

/* renamed from: X.GQi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41496GQi extends GQE<AVTextExtraStruct> {
    public final CharSequence LIZIZ;
    public final List<AVTextExtraStruct> LIZJ;
    public final GQU LIZLLL;
    public String LJ;
    public String LJFF;
    public final java.util.Map<String, String> LJI;
    public int LJII;
    public final C62822Ol8 LJIIIIZZ;

    public static boolean LIZJ(char c) {
        if ('a' <= c) {
            if (c >= '{') {
                return false;
            }
        } else if ('A' > c || c >= '[') {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0057. Please report as an issue. */
    public final int LIZLLL() {
        ((LinkedHashMap) this.LJI).clear();
        this.LJ = "";
        this.LJFF = "";
        int i = this.LJII + 1;
        this.LJII = i;
        if (i >= this.LIZIZ.length()) {
            this.LJ = "";
            this.LJFF = "";
            return 4;
        }
        char c = 'd';
        String str = "";
        String str2 = "";
        char c2 = 'd';
        while (this.LJII < this.LIZIZ.length()) {
            if (c2 != c) {
                if (c2 != 'n') {
                    if (c2 != 140) {
                        if (c2 != 130) {
                            if (c2 != 131) {
                                switch (c2) {
                                    case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                                        if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append(this.LJ);
                                            LIZ.append(this.LIZIZ.charAt(this.LJII));
                                            this.LJ = X1D.LIZIZ(LIZ);
                                            this.LJII++;
                                            break;
                                        } else if (this.LIZIZ.charAt(this.LJII) == ' ') {
                                            this.LJII++;
                                            c2 = 'y';
                                            break;
                                        } else {
                                            if (this.LIZIZ.charAt(this.LJII) == '>') {
                                                return 0;
                                            }
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append("Illegal character in tag name, expected=[a-z||A-Z], actual=");
                                            LIZ2.append(this.LIZIZ.charAt(this.LJII));
                                            LIZ2.append(", parsed sub sequence: ");
                                            LIZ2.append((Object) this.LIZIZ.subSequence(0, this.LJII));
                                            throw new GB5(X1D.LIZIZ(LIZ2), null, 2, null);
                                        }
                                    case 'y':
                                        if (this.LIZIZ.charAt(this.LJII) == ' ') {
                                            this.LJII++;
                                            break;
                                        } else if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("");
                                            LIZ3.append(this.LIZIZ.charAt(this.LJII));
                                            str = X1D.LIZIZ(LIZ3);
                                            this.LJII++;
                                            c2 = 'z';
                                            break;
                                        } else {
                                            StringBuilder LIZ4 = X1D.LIZ();
                                            LIZ4.append("Illegal character in attribute key, expected=[a-z||A-Z], actual=");
                                            LIZ4.append(this.LIZIZ.charAt(this.LJII));
                                            throw new GB5(X1D.LIZIZ(LIZ4), null, 2, null);
                                        }
                                    case 'z':
                                        if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                            StringBuilder LIZ5 = X1D.LIZ();
                                            LIZ5.append(str);
                                            LIZ5.append(this.LIZIZ.charAt(this.LJII));
                                            str = X1D.LIZIZ(LIZ5);
                                            this.LJII++;
                                            break;
                                        } else if (this.LIZIZ.charAt(this.LJII) == '=') {
                                            this.LJII++;
                                            c2 = '{';
                                            break;
                                        } else {
                                            StringBuilder LIZ6 = X1D.LIZ();
                                            LIZ6.append("Illegal character in attribute key, expected=[a-z||A-Z], actual=");
                                            LIZ6.append(this.LIZIZ.charAt(this.LJII));
                                            throw new GB5(X1D.LIZIZ(LIZ6), null, 2, null);
                                        }
                                    case '{':
                                        c2 = '|';
                                        if (this.LIZIZ.charAt(this.LJII) == '\"') {
                                            this.LJII++;
                                            str2 = "";
                                            break;
                                        } else if (this.LIZIZ.charAt(this.LJII) != '\'') {
                                            if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                                StringBuilder LIZ7 = X1D.LIZ();
                                                LIZ7.append("");
                                                LIZ7.append(this.LIZIZ.charAt(this.LJII));
                                                str2 = X1D.LIZIZ(LIZ7);
                                                this.LJII++;
                                                break;
                                            } else {
                                                StringBuilder LIZ8 = X1D.LIZ();
                                                LIZ8.append("Illegal character in attribute value, expected=[a-z||A-Z], actual=");
                                                LIZ8.append(this.LIZIZ.charAt(this.LJII));
                                                throw new GB5(X1D.LIZIZ(LIZ8), null, 2, null);
                                            }
                                        } else {
                                            throw new GB5("We only support double quotation marks in attribute declaration of a tag, so use double quotation marks instead of single quotation marks.", null, 2, null);
                                        }
                                    case '|':
                                        char charAt = this.LIZIZ.charAt(this.LJII);
                                        if (LIZJ(charAt) || ('0' > charAt ? charAt == '#' : charAt < ':')) {
                                            StringBuilder LIZ9 = X1D.LIZ();
                                            LIZ9.append(str2);
                                            LIZ9.append(this.LIZIZ.charAt(this.LJII));
                                            str2 = X1D.LIZIZ(LIZ9);
                                            this.LJII++;
                                            break;
                                        } else if (this.LIZIZ.charAt(this.LJII) == '\"') {
                                            this.LJI.put(str, str2);
                                            this.LJII++;
                                            c2 = '}';
                                            str = "";
                                            str2 = "";
                                            break;
                                        } else if (this.LIZIZ.charAt(this.LJII) == ' ') {
                                            this.LJI.put(str, str2);
                                            this.LJII++;
                                            str = "";
                                            str2 = "";
                                            c2 = 'y';
                                            break;
                                        } else {
                                            StringBuilder LIZ10 = X1D.LIZ();
                                            LIZ10.append("Illegal character in attribute value, expected=[a-z||A-Z], actual=");
                                            LIZ10.append(this.LIZIZ.charAt(this.LJII));
                                            throw new GB5(X1D.LIZIZ(LIZ10), null, 2, null);
                                        }
                                        break;
                                    case '}':
                                        if (this.LIZIZ.charAt(this.LJII) == ' ') {
                                            if (str.length() > 0 || str2.length() > 0) {
                                                this.LJI.put(str, str2);
                                                str = "";
                                                str2 = "";
                                            }
                                            this.LJII++;
                                            c2 = 'y';
                                            break;
                                        } else {
                                            if (this.LIZIZ.charAt(this.LJII) == '>') {
                                                return 0;
                                            }
                                            throw new GB5("attribute value accepted, only space or > is acceptable", null, 2, null);
                                        }
                                        break;
                                    case '~':
                                        this.LJII--;
                                        return 0;
                                }
                            } else if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                StringBuilder LIZ11 = X1D.LIZ();
                                LIZ11.append(this.LJ);
                                LIZ11.append(this.LIZIZ.charAt(this.LJII));
                                this.LJ = X1D.LIZIZ(LIZ11);
                                this.LJII++;
                            } else {
                                if (this.LIZIZ.charAt(this.LJII) == '>') {
                                    if (this.LJ.length() != 0) {
                                        return 2;
                                    }
                                    throw new GB5("Illegal end tag, end tag name is empty", null, 2, null);
                                }
                                StringBuilder LIZ12 = X1D.LIZ();
                                LIZ12.append("Illegal end tag, expected: [a-z||A-Z], actual: ");
                                LIZ12.append(this.LIZIZ.charAt(this.LJII));
                                throw new GB5(X1D.LIZIZ(LIZ12), null, 2, null);
                            }
                        } else if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                            StringBuilder LIZ13 = X1D.LIZ();
                            LIZ13.append(this.LJ);
                            LIZ13.append(this.LIZIZ.charAt(this.LJII));
                            this.LJ = X1D.LIZIZ(LIZ13);
                            this.LJII++;
                            c = 'd';
                            c2 = 131;
                        } else {
                            StringBuilder LIZ14 = X1D.LIZ();
                            LIZ14.append("Illegal end tag, expected: [a-z||A-Z], actual: ");
                            LIZ14.append(this.LIZIZ.charAt(this.LJII));
                            throw new GB5(X1D.LIZIZ(LIZ14), null, 2, null);
                        }
                    } else {
                        if (this.LIZIZ.charAt(this.LJII) == '<') {
                            this.LJII--;
                            return 1;
                        }
                        if (this.LIZIZ.charAt(this.LJII) != '>') {
                            StringBuilder LIZ15 = X1D.LIZ();
                            LIZ15.append(this.LJFF);
                            LIZ15.append(this.LIZIZ.charAt(this.LJII));
                            this.LJFF = X1D.LIZIZ(LIZ15);
                            this.LJII++;
                        } else {
                            throw new GB5("greater-than character should be escaped", null, 2, null);
                        }
                    }
                } else if (this.LIZIZ.charAt(this.LJII) == '/') {
                    this.LJII++;
                    c = 'd';
                    c2 = 130;
                } else if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                    StringBuilder LIZ16 = X1D.LIZ();
                    LIZ16.append(this.LJ);
                    LIZ16.append(this.LIZIZ.charAt(this.LJII));
                    this.LJ = X1D.LIZIZ(LIZ16);
                    this.LJII++;
                    c2 = 'x';
                } else {
                    StringBuilder LIZ17 = X1D.LIZ();
                    LIZ17.append("Illegal character in tag name, expected=[a-z||A-Z], actual=");
                    LIZ17.append(this.LIZIZ.charAt(this.LJII));
                    throw new GB5(X1D.LIZIZ(LIZ17), null, 2, null);
                }
            } else {
                if (this.LIZIZ.charAt(this.LJII) == '<') {
                    c2 = 'n';
                } else if (this.LIZIZ.charAt(this.LJII) != '>') {
                    StringBuilder LIZ18 = X1D.LIZ();
                    LIZ18.append(this.LJFF);
                    LIZ18.append(this.LIZIZ.charAt(this.LJII));
                    this.LJFF = X1D.LIZIZ(LIZ18);
                    c2 = 140;
                } else {
                    throw new GB5("invalid character >", null, 2, null);
                }
                this.LJII++;
            }
            c = 'd';
        }
        if (this.LJII >= this.LIZIZ.length()) {
            if (c2 != 'n') {
                if (c2 == 140) {
                    return 1;
                }
            } else {
                throw new GB5("tag incomplete", null, 2, null);
            }
        }
        return 4;
    }

    public final String LIZIZ(String str) {
        for (Map.Entry entry : ((java.util.Map) this.LJIIIIZZ.getValue()).entrySet()) {
            str = o.LJJJJZ(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    public final ORV LJ(boolean z) {
        int length;
        String str;
        ORV orv = new ORV();
        ORV<C41497GQj> orv2 = new ORV<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (AVTextExtraStruct aVTextExtraStruct : this.LIZJ) {
            String tagId = aVTextExtraStruct.getTagId();
            if (tagId != null) {
                hashMap.put(tagId, aVTextExtraStruct);
            } else {
                throw new GB5("Use markup text protocol but tag_id is null!", null, 2, null);
            }
        }
        int LIZLLL = LIZLLL();
        while (LIZLLL != 4) {
            if (LIZLLL != 0) {
                if (LIZLLL != 1) {
                    if (LIZLLL != 2) {
                        continue;
                    } else {
                        C41497GQj c41497GQj = new C41497GQj(this.LJ, 2, 4);
                        CharSequence charSequence = c41497GQj.LJLIL;
                        if (kotlin.jvm.internal.o.LJ(charSequence, "v")) {
                            OSZ osz = (OSZ) ORS.LJJZ(arrayList);
                            if (osz != null && kotlin.jvm.internal.o.LJ(((C41497GQj) osz.getFirst()).LJLIL, "v")) {
                                if (((C41497GQj) osz.getFirst()).LJLILLLLZI != 2) {
                                    orv2.addLast(c41497GQj);
                                }
                            } else {
                                throw new GB5("markup stack do not have a video tag", null, 2, null);
                            }
                        } else if (kotlin.jvm.internal.o.LJ(charSequence, "d")) {
                            OSZ osz2 = (OSZ) ORS.LJJZ(arrayList);
                            if (osz2 != null && kotlin.jvm.internal.o.LJ(((C41497GQj) osz2.getFirst()).LJLIL, "d")) {
                                LIZ(c41497GQj, orv2);
                            } else {
                                throw new GB5("markup stack do not have a duet chain start tag", null, 2, null);
                            }
                        } else if (kotlin.jvm.internal.o.LJ(charSequence, "s")) {
                            OSZ osz3 = (OSZ) ORS.LJJZ(arrayList);
                            if (osz3 != null && kotlin.jvm.internal.o.LJ(((C41497GQj) osz3.getFirst()).LJLIL, "s")) {
                                LIZ(c41497GQj, orv2);
                            } else {
                                throw new GB5("markup stack do not have a stitch chain start tag", null, 2, null);
                            }
                        } else if (kotlin.jvm.internal.o.LJ(charSequence, "m")) {
                            if (arrayList.size() >= 1) {
                                OSZ osz4 = (OSZ) AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
                                CharSequence charSequence2 = ((C41497GQj) osz4.getFirst()).LJLIL;
                                if (kotlin.jvm.internal.o.LJ(charSequence2, "v")) {
                                    arrayList.remove(osz4);
                                    int intValue = ((Number) osz4.getSecond()).intValue();
                                    int i = intValue + 1;
                                    if (orv2.size() > i) {
                                        if (kotlin.jvm.internal.o.LJ(orv2.get(intValue).LJLIL, "v") || kotlin.jvm.internal.o.LJ(orv2.get(i).LJLIL, "m")) {
                                            C41497GQj c41497GQj2 = orv2.get(i);
                                            c41497GQj2.getClass();
                                            c41497GQj2.LJLIL = "v";
                                            orv2.remove(orv2.get(intValue));
                                            c41497GQj.LJLIL = "v";
                                            arrayList.add(new OSZ(c41497GQj, Integer.valueOf(orv2.size())));
                                            orv2.addLast(c41497GQj);
                                        } else {
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append("markup text parse error! markup text: ");
                                            LIZ.append((Object) this.LIZIZ);
                                            throw new GB5(X1D.LIZIZ(LIZ), null, 2, null);
                                        }
                                    } else {
                                        throw new GB5("markObjects should have a mention user start tag", null, 2, null);
                                    }
                                } else if (kotlin.jvm.internal.o.LJ(charSequence2, "d") || kotlin.jvm.internal.o.LJ(charSequence2, "s")) {
                                    boolean LJ = kotlin.jvm.internal.o.LJ(((C41497GQj) osz4.getFirst()).LJLIL, "d");
                                    if (orv2.size() < 3 || !kotlin.jvm.internal.o.LJ(orv2.get(orv2.size() - 2).LJLIL, "m") || orv2.get(orv2.size() - 2).LJLILLLLZI != 0) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("markup text parse ");
                                        if (LJ) {
                                            str = "duet";
                                        } else {
                                            str = "stitch";
                                        }
                                        LIZ2.append(str);
                                        LIZ2.append(" chain error! markup text: ");
                                        LIZ2.append((Object) this.LIZIZ);
                                        throw new GB5(X1D.LIZIZ(LIZ2), null, 2, null);
                                    }
                                    C41497GQj c41497GQj3 = orv2.get(orv2.size() - 2);
                                    c41497GQj3.getClass();
                                    c41497GQj3.LJLIL = "v";
                                    String str2 = orv2.get(orv2.size() - 2).LJLJI.get("id");
                                    if (str2 == null || str2.length() == 0 || hashMap.get(str2) == null) {
                                        throw new GB5("mention user start tag should have a tagId and corresponding textExtra", null, 2, null);
                                    }
                                    Object obj = hashMap.get(str2);
                                    if (obj != null) {
                                        ((AVTextExtraStruct) obj).subType = 1;
                                        c41497GQj.LJLIL = "v";
                                        orv2.addLast(c41497GQj);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                orv2.addLast(c41497GQj);
                            }
                        } else if (kotlin.jvm.internal.o.LJ(charSequence, "rc") || kotlin.jvm.internal.o.LJ(charSequence, "rs") || kotlin.jvm.internal.o.LJ(charSequence, "as")) {
                            LIZ(c41497GQj, orv2);
                        } else {
                            orv2.addLast(c41497GQj);
                        }
                    }
                } else {
                    orv2.addLast(new C41497GQj(this.LJFF, 1, 4));
                }
            } else {
                C41497GQj c41497GQj4 = new C41497GQj(this.LJ, 0, new HashMap(this.LJI));
                int size = orv2.size();
                CharSequence charSequence3 = c41497GQj4.LJLIL;
                if (kotlin.jvm.internal.o.LJ(charSequence3, "v") || kotlin.jvm.internal.o.LJ(charSequence3, "d") || kotlin.jvm.internal.o.LJ(charSequence3, "s")) {
                    arrayList.add(new OSZ(c41497GQj4, Integer.valueOf(size)));
                }
                orv2.addLast(c41497GQj4);
            }
            LIZLLL = LIZLLL();
        }
        C41497GQj LJIILJJIL = orv2.LJIILJJIL();
        if (LJIILJJIL != null && LJIILJJIL.LJLILLLLZI == 2 && (kotlin.jvm.internal.o.LJ(LJIILJJIL.LJLIL, "m") || kotlin.jvm.internal.o.LJ(LJIILJJIL.LJLIL, "h"))) {
            orv2.addLast(new C41497GQj(" ", 1, 4));
        }
        Iterator<C41497GQj> it = orv2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C41497GQj next = it.next();
            int i3 = next.LJLILLLLZI;
            if (i3 != -1) {
                if (i3 != 0) {
                    String text = "";
                    if (i3 != 1) {
                        if (i3 != 2) {
                            continue;
                        } else {
                            CharSequence charSequence4 = next.LJLIL;
                            if (kotlin.jvm.internal.o.LJ(charSequence4, "m")) {
                                AbstractC41507GQt abstractC41507GQt = (AbstractC41507GQt) orv.LJIIZILJ();
                                if (abstractC41507GQt != null) {
                                    AbstractC41507GQt abstractC41507GQt2 = (AbstractC41507GQt) orv.LJIILJJIL();
                                    if (abstractC41507GQt2 instanceof C41512GQy) {
                                        String LJIILL = abstractC41507GQt.LJIILL();
                                        i2 -= LJIILL.length();
                                        C41512GQy c41512GQy = (C41512GQy) abstractC41507GQt2;
                                        String substring = LJIILL.substring(1);
                                        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                                        c41512GQy.getClass();
                                        c41512GQy.LJIIJJI = substring;
                                        AVTextExtraStruct aVTextExtraStruct2 = (AVTextExtraStruct) hashMap.get(c41512GQy.LJ());
                                        if (aVTextExtraStruct2 != null) {
                                            aVTextExtraStruct2.start = i2;
                                            aVTextExtraStruct2.end = LJIILL.length() + i2;
                                            length = LJIILL.length();
                                            i2 = length + i2;
                                        }
                                    } else {
                                        throw new GB5("end mention user tag, but no start tag", null, 2, null);
                                    }
                                } else {
                                    throw new GB5("end mention user tag, but no user display name provided", null, 2, null);
                                }
                            } else if (kotlin.jvm.internal.o.LJ(charSequence4, "v")) {
                                AbstractC41507GQt abstractC41507GQt3 = (AbstractC41507GQt) orv.LJIIZILJ();
                                if (abstractC41507GQt3 != null) {
                                    AbstractC41507GQt abstractC41507GQt4 = (AbstractC41507GQt) orv.LJIILJJIL();
                                    if (abstractC41507GQt4 instanceof C41509GQv) {
                                        String LJIILL2 = abstractC41507GQt3.LJIILL();
                                        i2 -= LJIILL2.length();
                                        C41509GQv c41509GQv = (C41509GQv) abstractC41507GQt4;
                                        String substring2 = LJIILL2.substring(1);
                                        kotlin.jvm.internal.o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                                        c41509GQv.getClass();
                                        c41509GQv.LJIIJJI = substring2;
                                        AVTextExtraStruct aVTextExtraStruct3 = (AVTextExtraStruct) hashMap.get(c41509GQv.LJ());
                                        if (aVTextExtraStruct3 != null) {
                                            aVTextExtraStruct3.start = i2;
                                            aVTextExtraStruct3.end = LJIILL2.length() + i2;
                                            length = LJIILL2.length();
                                            i2 = length + i2;
                                        }
                                    } else {
                                        throw new GB5("end mention video tag, but no start tag", null, 2, null);
                                    }
                                } else {
                                    throw new GB5("end mention video tag, but no video display name provided", null, 2, null);
                                }
                            } else if (kotlin.jvm.internal.o.LJ(charSequence4, "h")) {
                                AbstractC41507GQt abstractC41507GQt5 = (AbstractC41507GQt) orv.LJIIZILJ();
                                if (abstractC41507GQt5 != null) {
                                    AbstractC41507GQt abstractC41507GQt6 = (AbstractC41507GQt) orv.LJIILJJIL();
                                    if (abstractC41507GQt6 instanceof GR9) {
                                        String LJIILL3 = abstractC41507GQt5.LJIILL();
                                        i2 -= LJIILL3.length();
                                        GR9 gr9 = (GR9) abstractC41507GQt6;
                                        String substring3 = LJIILL3.substring(1);
                                        kotlin.jvm.internal.o.LJIIIIZZ(substring3, "this as java.lang.String).substring(startIndex)");
                                        gr9.getClass();
                                        gr9.LJIIIZ = substring3;
                                        AVTextExtraStruct aVTextExtraStruct4 = (AVTextExtraStruct) hashMap.get(gr9.LJ());
                                        if (aVTextExtraStruct4 != null) {
                                            aVTextExtraStruct4.start = i2;
                                            aVTextExtraStruct4.end = LJIILL3.length() + i2;
                                            length = LJIILL3.length();
                                            i2 = length + i2;
                                        }
                                    } else {
                                        throw new GB5("end hashtag tag, but no start tag", null, 2, null);
                                    }
                                } else {
                                    throw new GB5("end hashtag tag, but no hashtag name provided", null, 2, null);
                                }
                            } else if (kotlin.jvm.internal.o.LJ(charSequence4, "s")) {
                                GR3 gr3 = new GR3(0);
                                gr3.LJJIIJ(EnumC35470Dw2.RTL);
                                while (!orv.isEmpty() && gr3.LIZ((AbstractC41507GQt) orv.last())) {
                                    orv.removeLast();
                                }
                                orv.addLast(gr3);
                            } else if (kotlin.jvm.internal.o.LJ(charSequence4, "d")) {
                                GR2 gr2 = new GR2(0);
                                gr2.LJJIIJ(EnumC35470Dw2.RTL);
                                while (!orv.isEmpty() && gr2.LIZ((AbstractC41507GQt) orv.last())) {
                                    orv.removeLast();
                                }
                                orv.addLast(gr2);
                            } else if (kotlin.jvm.internal.o.LJ(charSequence4, "rc")) {
                                C41513GQz c41513GQz = new C41513GQz(0);
                                c41513GQz.LJJIIJ(EnumC35470Dw2.RTL);
                                while (!orv.isEmpty() && c41513GQz.LIZ((AbstractC41507GQt) orv.last())) {
                                    orv.removeLast();
                                }
                                orv.addLast(c41513GQz);
                            } else if (kotlin.jvm.internal.o.LJ(charSequence4, "rs")) {
                                GR0 gr0 = new GR0(0);
                                gr0.LJJIIJ(EnumC35470Dw2.RTL);
                                while (!orv.isEmpty() && gr0.LIZ((AbstractC41507GQt) orv.last())) {
                                    orv.removeLast();
                                }
                                orv.addLast(gr0);
                            } else if (kotlin.jvm.internal.o.LJ(charSequence4, "as")) {
                                GR1 gr1 = new GR1(0);
                                gr1.LJJIIJ(EnumC35470Dw2.RTL);
                                while (!orv.isEmpty() && gr1.LIZ((AbstractC41507GQt) orv.last())) {
                                    orv.removeLast();
                                }
                                orv.addLast(gr1);
                            } else {
                                GQU gqu = this.LIZLLL;
                                if (gqu.LJLIL && gqu.LJLILLLLZI) {
                                    while (true) {
                                        if (!(!orv.isEmpty())) {
                                            break;
                                        }
                                        AbstractC41507GQt abstractC41507GQt7 = (AbstractC41507GQt) orv.last();
                                        if (abstractC41507GQt7 instanceof C41498GQk) {
                                            abstractC41507GQt7.getClass();
                                            kotlin.jvm.internal.o.LJIIIZ(text, "text");
                                            break;
                                        }
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append(abstractC41507GQt7.LJIILL());
                                        LIZ3.append(text);
                                        text = X1D.LIZIZ(LIZ3);
                                        orv.removeLast();
                                    }
                                    if (!(orv.LJIILJJIL() instanceof C41498GQk)) {
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append("unknown tag has no start tag, only end tag present, tag: ");
                                        LIZ4.append((Object) next.LJLIL);
                                        LIZ4.append(", attributes: ");
                                        LIZ4.append(next.LJLJI);
                                        throw new GB5(X1D.LIZIZ(LIZ4), null, 2, null);
                                    }
                                }
                            }
                        }
                    } else {
                        while (!orv.isEmpty() && (orv.last() instanceof C41503GQp)) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append(((AbstractC41507GQt) orv.removeLast()).LJIILL());
                            LIZ5.append(text);
                            text = X1D.LIZIZ(LIZ5);
                        }
                        int length2 = i2 - text.length();
                        int length3 = LIZIZ(next.LJLIL.toString()).length() + i2;
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append(text);
                        LIZ6.append(LIZIZ(next.LJLIL.toString()));
                        orv.addLast(new C41503GQp(length2, length3, X1D.LIZIZ(LIZ6)));
                        i2 += LIZIZ(next.LJLIL.toString()).length();
                    }
                } else {
                    CharSequence charSequence5 = next.LJLIL;
                    if (kotlin.jvm.internal.o.LJ(charSequence5, "h")) {
                        String str3 = next.LJLJI.get("id");
                        if (str3 != null) {
                            if (hashMap.get(str3) != null) {
                                GR9 gr92 = new GR9(i2, next.LJLIL.length() + i2);
                                gr92.LJIILJJIL(str3);
                                orv.addLast(gr92);
                            } else {
                                StringBuilder LIZ7 = X1D.LIZ();
                                LIZ7.append("tag_id not found in metadata, tag=");
                                LIZ7.append((Object) next.LJLIL);
                                throw new GB5(X1D.LIZIZ(LIZ7), null, 2, null);
                            }
                        } else {
                            throw new GB5("hashtag id is null", null, 2, null);
                        }
                    } else if (kotlin.jvm.internal.o.LJ(charSequence5, "m")) {
                        String str4 = next.LJLJI.get("id");
                        if (str4 != null) {
                            AVTextExtraStruct aVTextExtraStruct5 = (AVTextExtraStruct) hashMap.get(str4);
                            if (aVTextExtraStruct5 != null) {
                                int length4 = next.LJLIL.length() + i2;
                                String str5 = aVTextExtraStruct5.userId;
                                if (str5 != null) {
                                    C41512GQy c41512GQy2 = new C41512GQy(i2, length4, new C41506GQs(str5, aVTextExtraStruct5.getSecUid()));
                                    c41512GQy2.LJIILJJIL(str4);
                                    orv.addLast(c41512GQy2);
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                StringBuilder LIZ8 = X1D.LIZ();
                                LIZ8.append("tag_id not found in metadata, tag=");
                                LIZ8.append((Object) next.LJLIL);
                                throw new GB5(X1D.LIZIZ(LIZ8), null, 2, null);
                            }
                        } else {
                            throw new GB5("mention user id is null", null, 2, null);
                        }
                    } else if (kotlin.jvm.internal.o.LJ(charSequence5, "v")) {
                        String str6 = next.LJLJI.get("id");
                        if (str6 != null) {
                            AVTextExtraStruct aVTextExtraStruct6 = (AVTextExtraStruct) hashMap.get(str6);
                            if (aVTextExtraStruct6 != null) {
                                int length5 = next.LJLIL.length() + i2;
                                String str7 = aVTextExtraStruct6.awemeId;
                                if (str7 != null) {
                                    String str8 = aVTextExtraStruct6.userId;
                                    if (str8 != null) {
                                        C41509GQv c41509GQv2 = new C41509GQv(i2, length5, str7, new C41506GQs(str8, aVTextExtraStruct6.getSecUid()));
                                        c41509GQv2.LJIILJJIL(str6);
                                        orv.addLast(c41509GQv2);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                StringBuilder LIZ9 = X1D.LIZ();
                                LIZ9.append("tag_id not found in metadata, tag=");
                                LIZ9.append((Object) next.LJLIL);
                                throw new GB5(X1D.LIZIZ(LIZ9), null, 2, null);
                            }
                        } else {
                            throw new GB5("mention video id is null", null, 2, null);
                        }
                    } else if (kotlin.jvm.internal.o.LJ(charSequence5, "br")) {
                        String str9 = "\n";
                        while (!orv.isEmpty()) {
                            AbstractC41507GQt abstractC41507GQt8 = (AbstractC41507GQt) orv.last();
                            if (!(abstractC41507GQt8 instanceof C41503GQp)) {
                                break;
                            }
                            StringBuilder LIZ10 = X1D.LIZ();
                            LIZ10.append(abstractC41507GQt8.LJIILL());
                            LIZ10.append(str9);
                            str9 = X1D.LIZIZ(LIZ10);
                            orv.removeLast();
                        }
                        int i4 = i2 + 1;
                        orv.addLast(new C41503GQp(i2, i4, str9));
                        i2 = i4;
                    } else if (!kotlin.jvm.internal.o.LJ(charSequence5, "d") && !kotlin.jvm.internal.o.LJ(charSequence5, "s") && !kotlin.jvm.internal.o.LJ(charSequence5, "rc") && !kotlin.jvm.internal.o.LJ(charSequence5, "as") && !kotlin.jvm.internal.o.LJ(charSequence5, "rs")) {
                        GQU gqu2 = this.LIZLLL;
                        if (gqu2.LJLIL && gqu2.LJLILLLLZI) {
                            orv.addLast(new C41498GQk(next.LJLIL.toString(), next.LJLJI));
                        }
                    }
                }
            } else {
                throw new GB5("Unknown markup object", null, 2, null);
            }
        }
        if (z) {
            Iterator<E> it2 = orv.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    ((AbstractC41507GQt) next2).LJIILJJIL(String.valueOf(i5));
                    i5 = i6;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return orv;
    }

    public final void LIZ(C41497GQj c41497GQj, ORV<C41497GQj> orv) {
        boolean z;
        CharSequence charSequence;
        if (this.LIZLLL.LJLIL) {
            C41497GQj LJIILJJIL = orv.LJIILJJIL();
            if (LJIILJJIL != null) {
                charSequence = LJIILJJIL.LJLIL;
            } else {
                charSequence = null;
            }
            if (!kotlin.jvm.internal.o.LJ(charSequence, " ")) {
                z = false;
                if (orv.size() <= 3 && orv.get(orv.size() - 1).LJLILLLLZI == 1 && orv.get(orv.size() - 2).LJLILLLLZI == 2 && z) {
                    C41497GQj removeLast = orv.removeLast();
                    orv.addLast(c41497GQj);
                    orv.addLast(removeLast);
                    return;
                }
                orv.addLast(c41497GQj);
            }
        }
        z = true;
        if (orv.size() <= 3) {
        }
        orv.addLast(c41497GQj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41496GQi(CharSequence markupText, List<AVTextExtraStruct> metadatas, GQU config) {
        super(markupText, metadatas);
        kotlin.jvm.internal.o.LJIIIZ(markupText, "markupText");
        kotlin.jvm.internal.o.LJIIIZ(metadatas, "metadatas");
        kotlin.jvm.internal.o.LJIIIZ(config, "config");
        this.LIZIZ = markupText;
        this.LIZJ = metadatas;
        this.LIZLLL = config;
        this.LJ = "";
        this.LJFF = "";
        this.LJI = new LinkedHashMap();
        this.LJII = -1;
        this.LJIIIIZZ = C221108m2.LIZIZ(C41501GQn.LJLIL);
    }
}
