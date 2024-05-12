package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.UserLevelBadgePositionSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TextPieceHelperBugfixSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.common.PatternRef;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceGift;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdk.model.message.common.TextPiecePatternRef;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class CXJ {
    public static final Spannable LIZ = new SpannableString("");

    public static int LIZJ(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return C15380j0.LIZIZ(R.color.abc);
        }
    }

    public static int LIZLLL(BadgeStruct badgeStruct) {
        int i = badgeStruct.badgeScene;
        if (i == 8 || i == 10 || i == 4) {
            return 1;
        }
        if (i == 6) {
            return UserLevelBadgePositionSetting.INSTANCE.getValue();
        }
        return 0;
    }

    public static boolean LJ(TextPieceImage textPieceImage) {
        if (textPieceImage == null || textPieceImage.imageModel == null) {
            return false;
        }
        return !TextUtils.isEmpty(((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).rM(textPieceImage.imageModel));
    }

    public static Spannable LJFF(Text text, String str) {
        String str2;
        if (text == null) {
            if (TextUtils.isEmpty(str)) {
                return LIZ;
            }
            return new SpannableString(str);
        }
        if (text.key != null && !TextUtils.isEmpty(C86881Y7x.LIZIZ().LIZ(text.key))) {
            str2 = C86881Y7x.LIZIZ().LIZ(text.key);
        } else {
            str2 = text.defaultPattern;
        }
        Spannable LJI = LJI(str2, text, null);
        Spannable spannable = LIZ;
        if (LJI != spannable) {
            return LJI;
        }
        if (TextUtils.isEmpty(str)) {
            return spannable;
        }
        return new SpannableString(str);
    }

    public static CharSequence LJIIIIZZ(User user, CXK cxk) {
        String str;
        String str2;
        BadgeStruct badgeStruct;
        C31468CWq LJI;
        C31468CWq LJI2;
        BadgeStruct badgeStruct2;
        if (user == null) {
            return null;
        }
        if (cxk != null && cxk.LJJJLZIJ(user) != null) {
            str = cxk.LJJJLZIJ(user).toString();
        } else {
            str = "";
        }
        if ((!str.isEmpty() || (str = C05170If.LIZ(user)) != null) && cxk != null) {
            List<CQV> LJJIIJZLJL = cxk.LJJIIJZLJL(user);
            if (LJJIIJZLJL == null || LJJIIJZLJL.isEmpty()) {
                LJJIIJZLJL = new ArrayList<>();
            }
            if (cxk.LJJJJIZL() != 0 && str.length() > cxk.LJJJJIZL()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str.substring(0, cxk.LJJJJIZL() - 1));
                LIZ2.append("...");
                str2 = X1D.LIZIZ(LIZ2);
            } else {
                str2 = str;
            }
            C31465CWn LJJIL = cxk.LJJIL(user);
            BadgeStruct LJJJJJ = cxk.LJJJJJ(user);
            if (LJJIL != null && LJJJJJ != null && LJJIIJZLJL.isEmpty()) {
                LJJIIJZLJL.add(new CQV(LJJIL, LJJJJJ));
            }
            if (!LJJIIJZLJL.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < LJJIIJZLJL.size(); i++) {
                    CQV cqv = (CQV) ListProtector.get(LJJIIJZLJL, i);
                    if (cqv != null && cqv.LIZ != null && (badgeStruct2 = cqv.LIZIZ) != null) {
                        if (LIZLLL(badgeStruct2) == 1) {
                            if (sb.length() >= 1) {
                                sb.append((char) 65532);
                            }
                            sb.append((char) 65532);
                        }
                        if (LIZLLL(cqv.LIZIZ) == 0) {
                            if (sb2.length() >= 1) {
                                sb2.append((char) 65532);
                            }
                            sb2.append((char) 65532);
                        }
                    }
                }
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(sb.toString());
                LIZ3.append(str2);
                LIZ3.append(sb2.toString());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X1D.LIZIZ(LIZ3));
                int i2 = 0;
                for (int i3 = 0; i3 < LJJIIJZLJL.size(); i3++) {
                    if (LIZLLL(((CQV) ListProtector.get(LJJIIJZLJL, i3)).LIZIZ) == 1) {
                        i2++;
                    }
                }
                if (i2 > 0) {
                    i2++;
                }
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < LJJIIJZLJL.size(); i6++) {
                    CQV cqv2 = (CQV) ListProtector.get(LJJIIJZLJL, i6);
                    if (cqv2 != null && cqv2.LIZ != null && (badgeStruct = cqv2.LIZIZ) != null) {
                        if (LIZLLL(badgeStruct) == 1) {
                            if (i4 >= 1 && (LJI2 = cxk.LJI()) != null) {
                                int i7 = i4 + 1;
                                spannableStringBuilder.setSpan(LJI2, i4, i7, 33);
                                i4 = i7;
                            }
                            int i8 = i4 + 1;
                            spannableStringBuilder.setSpan(cqv2.LIZ, i4, i8, 33);
                            i4 = i8;
                        }
                        spannableStringBuilder.setSpan(cxk.LJIILJJIL(0, user), str.length(), str.length() + 1, 33);
                        if (LIZLLL(cqv2.LIZIZ) == 0) {
                            if (i5 >= 1 && (LJI = cxk.LJI()) != null) {
                                spannableStringBuilder.setSpan(LJI, C1FL.LIZ(str, i2, i5), str.length() + i5 + 1, 33);
                                i5++;
                            }
                            spannableStringBuilder.setSpan(cqv2.LIZ, C1FL.LIZ(str, i2, i5), str.length() + i2 + i5 + 1, 33);
                            i5++;
                        }
                    }
                }
                return spannableStringBuilder;
            }
        }
        return i0.LJFF("\u200e", str);
    }

    public static Spannable LJI(String str, Text text, CXK cxk) {
        if (TextUtils.isEmpty(str) || text == null) {
            return LIZ;
        }
        List<TextPiece> list = text.pieces;
        if (list == null || list.size() == 0) {
            SpannableString spannableString = new SpannableString(str);
            if (cxk != null) {
                spannableString.setSpan(new ForegroundColorSpan(cxk.LJJLIIIJJI()), 0, spannableString.length(), 18);
            } else {
                TextFormat textFormat = text.defaultFormat;
                if (textFormat != null && !TextUtils.isEmpty(textFormat.color)) {
                    spannableString.setSpan(new ForegroundColorSpan(LIZJ(textFormat.color)), 0, spannableString.length(), 18);
                }
            }
            LJIIIZ(spannableString, 0, spannableString.length(), cxk, false, -1);
            return spannableString;
        }
        try {
            List<TextPiece> list2 = text.pieces;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LJII(str, list2, arrayList, linkedHashMap, cxk);
            if (arrayList.size() > 0 && arrayList.size() == linkedHashMap.size()) {
                return LIZIZ(text, arrayList, linkedHashMap, cxk);
            }
            return LIZ;
        } catch (Exception e) {
            C0NB.LJIIJ(6, "ttlive_exception", e.getStackTrace());
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("stack_trace", stringWriter.toString());
            C0K2.LJII(1, O5Y.LJJLI("ttlive_parse_text_status"), hashMap);
            return LIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spannable LIZIZ(com.bytedance.android.livesdk.model.message.common.Text r16, java.util.List<java.lang.CharSequence> r17, java.util.Map<java.lang.Integer, com.bytedance.android.livesdk.model.message.common.TextPiece> r18, X.CXK r19) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXJ.LIZIZ(com.bytedance.android.livesdk.model.message.common.Text, java.util.List, java.util.Map, X.CXK):android.text.Spannable");
    }

    public static void LIZ(Spannable spannable, Bitmap bitmap, int i, int i2, CQO cqo) {
        if (bitmap == null || bitmap.isRecycled() || spannable.length() == 0 || i < 0 || i > spannable.length() || i > i2) {
            return;
        }
        Context LIZLLL = C15380j0.LIZLLL();
        int LIZJ = (int) KL2.LIZJ(C15380j0.LIZLLL(), 16.0f);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(LIZLLL.getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, LIZJ, LIZJ);
        spannable.setSpan(new C32207CkV(bitmapDrawable), i, i2, 33);
        LJIIIZ(spannable, i, i2, cqo, false, -1);
    }

    public static void LJII(String str, List<TextPiece> list, List<CharSequence> list2, java.util.Map<Integer, TextPiece> map, CXK cxk) {
        String str2;
        CharSequence charSequence;
        Gift gift;
        if (str == null || list == null || list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(list2);
        arrayList.add(map);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt != ':') {
                if (charAt != '{') {
                    if (charAt != '}') {
                        if (charAt == '}') {
                        }
                    } else {
                        if (i6 != i2) {
                            str2 = str.subSequence(i6, i3).toString();
                        } else {
                            i7 = CastIntegerProtector.valueOf(str.subSequence(i5, i3).toString()).intValue();
                            str2 = "string";
                        }
                        if (i7 != i2) {
                            if (sb.length() > 0) {
                                sb.delete(i, sb.length());
                            }
                            if (i7 >= 0 && i7 < list.size() && !TextUtils.isEmpty(str2) && list.size() != 0) {
                                TextPiece textPiece = (TextPiece) ListProtector.get(list, i7);
                                int i8 = textPiece.type;
                                CXI cxi = CXI.HEART;
                                if (i8 != cxi.getPieceType()) {
                                    cxi = CXI.USER;
                                    if (i8 != cxi.getPieceType()) {
                                        cxi = CXI.STRING;
                                        if (i8 != cxi.getPieceType()) {
                                            cxi = CXI.GIFT;
                                            if (i8 != cxi.getPieceType()) {
                                                cxi = CXI.PATTERN_REF;
                                                if (i8 != cxi.getPieceType()) {
                                                    cxi = CXI.IMAGE;
                                                    if (i8 != cxi.getPieceType()) {
                                                        cxi = CXI.UNKNOWN;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (cxi.getTag().equals(str2) || cxi.getTag().equals(CXI.PATTERN_REF.getTag())) {
                                    int i9 = textPiece.type;
                                    if (i9 == CXI.STRING.getPieceType()) {
                                        charSequence = textPiece.stringValue;
                                    } else if (i9 == CXI.USER.getPieceType()) {
                                        TextPieceUser textPieceUser = textPiece.userValue;
                                        if (textPieceUser != null) {
                                            charSequence = LJIIIIZZ(textPieceUser.user, cxk);
                                        }
                                        charSequence = null;
                                    } else if (i9 == CXI.GIFT.getPieceType()) {
                                        TextPieceGift textPieceGift = textPiece.giftValue;
                                        if (textPieceGift != null) {
                                            int i10 = textPieceGift.showType;
                                            if (i10 == 0) {
                                                PatternRef patternRef = textPieceGift.nameRef;
                                                if (patternRef != null && patternRef.key != null) {
                                                    String LIZ2 = C86881Y7x.LIZIZ().LIZ(textPieceGift.nameRef.key);
                                                    if (TextUtils.isEmpty(LIZ2)) {
                                                        LIZ2 = textPieceGift.nameRef.defaultPattern;
                                                    }
                                                    if (TextUtils.isEmpty(LIZ2)) {
                                                        LIZ2 = C15380j0.LJIILJJIL(R.string.stn);
                                                    }
                                                    charSequence = i0.LJFF(LIZ2, " . ");
                                                } else {
                                                    StringBuilder LIZ3 = X1D.LIZ();
                                                    LIZ3.append(C15380j0.LJIILJJIL(R.string.stn));
                                                    LIZ3.append(" . ");
                                                    charSequence = X1D.LIZIZ(LIZ3);
                                                }
                                            } else if (i10 == 1 && (gift = textPieceGift.LIZ) != null) {
                                                charSequence = gift.name;
                                            }
                                        }
                                        charSequence = null;
                                    } else if (textPiece.type == CXI.HEART.getPieceType()) {
                                        charSequence = " ";
                                    } else if (i9 == CXI.PATTERN_REF.getPieceType()) {
                                        TextPiecePatternRef textPiecePatternRef = textPiece.patternRefValue;
                                        if (textPiecePatternRef != null) {
                                            if (!TextUtils.isEmpty(textPiecePatternRef.key) && !TextUtils.isEmpty(C86881Y7x.LIZIZ().LIZ(textPiecePatternRef.key))) {
                                                charSequence = C86881Y7x.LIZIZ().LIZ(textPiecePatternRef.key);
                                            } else if (!TextUtils.isEmpty(textPiecePatternRef.defaultPattern)) {
                                                charSequence = textPiecePatternRef.defaultPattern;
                                            }
                                        }
                                        charSequence = "";
                                    } else {
                                        if (i9 == CXI.IMAGE.getPieceType()) {
                                            if (LJ(textPiece.imageValue)) {
                                                charSequence = ".";
                                            }
                                            charSequence = "";
                                        }
                                        charSequence = null;
                                    }
                                    ((ArrayList) list2).add(charSequence);
                                    map.put(Integer.valueOf(r0.size() - 1), textPiece);
                                    i4--;
                                    i6 = -1;
                                    i7 = -1;
                                } else {
                                    C0NB.LJ("I18N_MESSAGE", "TextPieceHelper: tag is false");
                                }
                            }
                            StringBuilder LJ = AnonymousClass028.LJ("piece result is null !!! \npattern:", str, "... index:", i7, "...tag:");
                            C1EW.LIZLLL(LJ, str2, LJ, "I18N_MESSAGE");
                            i4--;
                            i6 = -1;
                            i7 = -1;
                        } else {
                            return;
                        }
                    }
                    i3++;
                    i = 0;
                    i2 = -1;
                } else {
                    i4++;
                    if (i4 != 1) {
                        return;
                    }
                    i5 = i3 + 1;
                    if (sb.length() > 0 && sb.length() > 0) {
                        ((ArrayList) list2).add(sb.toString());
                        map.put(Integer.valueOf(r0.size() - 1), new CXO());
                        sb.delete(0, sb.length());
                    }
                }
                sb.append(charAt);
                i3++;
                i = 0;
                i2 = -1;
            } else if (i4 == 0) {
                if (TextPieceHelperBugfixSetting.getEnable()) {
                    sb.append(charAt);
                }
                i3++;
                i = 0;
                i2 = -1;
            } else {
                if (i4 != 1) {
                    return;
                }
                i7 = CastIntegerProtector.valueOf(str.subSequence(i5, i3).toString()).intValue();
                i6 = i3 + 1;
                i5 = -1;
                sb.append(charAt);
                i3++;
                i = 0;
                i2 = -1;
            }
        }
        if (sb.length() <= 0) {
            return;
        }
        ((ArrayList) list2).add(sb.toString());
        map.put(Integer.valueOf(r13.size() - 1), new CXO());
        sb.delete(i, sb.length());
    }

    public static void LJIIIZ(Spannable spannable, int i, int i2, CXK cxk, boolean z, int i3) {
        C30778C6c LJJLIIIJ;
        if (cxk != null && cxk.getUser() != null) {
            if (z) {
                LJJLIIIJ = cxk.LJJIJ(i3, cxk.getUser());
            } else {
                LJJLIIIJ = cxk.LJJLIIIJ(cxk.getUser());
            }
            spannable.setSpan(LJJLIIIJ, i, i2, 17);
        }
    }
}
