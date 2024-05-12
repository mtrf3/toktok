package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import ujb.s;

/* renamed from: X.86e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2058886e {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        String LIZJ = LIZJ(aweme);
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        if (textExtra != null && !textExtra.isEmpty()) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct.getType() == 0 && (C78685UuP.LJJJZ(textExtraStruct.getAwemeId()) || textExtraStruct.getSubtype() == 2)) {
                    return false;
                }
            }
        }
        if (!aweme.isDescTranslatable() || TextUtils.isEmpty(LIZJ) || TextUtils.equals(C86678Y0c.LIZIZ().LJJIIZI(), LIZJ) || ORY.LJJIJIIJIL(LIZJ, C86678Y0c.LIZIZ().LJIILLIIL())) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(Aweme aweme) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList arrayList = null;
        if (aweme == null) {
            return null;
        }
        String desc = aweme.getDesc();
        boolean z12 = false;
        if (AnonymousClass842.LIZ()) {
            String contentDesc = aweme.getContentDesc();
            if (contentDesc == null || contentDesc.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                List<TextExtraStruct> contentDescExtra = aweme.getContentDescExtra();
                if (contentDescExtra != null) {
                    arrayList = new ArrayList();
                    for (TextExtraStruct textExtraStruct : contentDescExtra) {
                        if (textExtraStruct != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList.add(textExtraStruct);
                        }
                    }
                }
                String contentDesc2 = aweme.getContentDesc();
                HashMap hashMap = new HashMap();
                if (arrayList == null || arrayList.isEmpty()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    if (contentDesc2 == null || contentDesc2.length() == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        o.LJIIIIZZ(contentDesc2, "contentDesc");
                        C40517FvF LJJLIIIIJ = s.LJJLIIIIJ(contentDesc2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            TextExtraStruct textExtraStruct2 = (TextExtraStruct) it.next();
                            int lineIndex = textExtraStruct2.getLineIndex();
                            if (lineIndex <= LJJLIIIIJ.LJLILLLLZI && lineIndex >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && textExtraStruct2.getStart() <= textExtraStruct2.getEnd()) {
                                if (!hashMap.containsKey(Integer.valueOf(lineIndex))) {
                                    hashMap.put(Integer.valueOf(lineIndex), new ArrayList());
                                }
                                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(lineIndex));
                                if (arrayList2 != null) {
                                    arrayList2.add(textExtraStruct2);
                                }
                            }
                        }
                    }
                }
                if (AnonymousClass842.LIZ() && C78685UuP.LJJJZ(aweme.getContentDesc())) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        JSONArray jSONArray = new JSONArray(aweme.getContentDesc());
                        int length = jSONArray.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            String lineDesc = jSONArray.getString(i3);
                            o.LJIIIIZZ(lineDesc, "lineDesc");
                            if (lineDesc.length() != 0) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (z6) {
                                if (i3 < length - 1) {
                                    sb.append("\n");
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                List<TextExtraStruct> list = (List) hashMap.get(Integer.valueOf(i3));
                                if (list == null) {
                                    list = C61878OQg.INSTANCE;
                                }
                                boolean[] zArr = new boolean[lineDesc.length()];
                                for (TextExtraStruct textExtraStruct3 : list) {
                                    int end = textExtraStruct3.getEnd();
                                    for (int start = textExtraStruct3.getStart(); start < end; start++) {
                                        zArr[start] = true;
                                    }
                                }
                                int length2 = lineDesc.length();
                                for (int i4 = 0; i4 < length2; i4++) {
                                    if (!zArr[i4]) {
                                        sb2.append(lineDesc.charAt(i4));
                                    }
                                }
                                String sb3 = sb2.toString();
                                o.LJIIIIZZ(sb3, "lineStringBuilder.toString()");
                                int length3 = sb3.length() - 1;
                                int i5 = 0;
                                boolean z13 = false;
                                while (i5 <= length3) {
                                    if (!z13) {
                                        i2 = i5;
                                    } else {
                                        i2 = length3;
                                    }
                                    if (sb3.charAt(i2) == ' ') {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (!z13) {
                                        if (!z8) {
                                            z13 = true;
                                        } else {
                                            i5++;
                                        }
                                    } else {
                                        if (!z8) {
                                            break;
                                        }
                                        length3--;
                                    }
                                }
                                String charSequence = sb3.subSequence(i5, length3 + 1).toString();
                                if (charSequence.length() > 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7 && !o.LJ(charSequence, "\n")) {
                                    sb.append(charSequence);
                                    if (i3 < length - 1) {
                                        sb.append("\n");
                                    }
                                }
                            }
                        }
                        if (sb.length() > 0) {
                            z12 = true;
                        }
                        if (!z12) {
                            return desc;
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                        if (sb.length() > 0) {
                            z12 = true;
                        }
                        if (!z12) {
                            return desc;
                        }
                    } finally {
                        sb.length();
                    }
                    return sb.toString();
                }
                return desc;
            }
        }
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        if (desc == null || desc.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        if (textExtra == null || textExtra.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return desc;
        }
        boolean[] zArr2 = new boolean[desc.length()];
        for (TextExtraStruct textExtraStruct4 : textExtra) {
            if (textExtraStruct4 != null) {
                int start2 = textExtraStruct4.getStart();
                if (start2 < 0) {
                    start2 = 0;
                }
                int end2 = textExtraStruct4.getEnd();
                int length4 = desc.length();
                if (end2 > length4) {
                    end2 = length4;
                }
                if (textExtraStruct4.getStart() > textExtraStruct4.getEnd()) {
                    start2 = textExtraStruct4.getEnd();
                    if (start2 < 0) {
                        start2 = 0;
                    }
                    end2 = textExtraStruct4.getStart();
                    int length5 = desc.length();
                    if (end2 > length5) {
                        end2 = length5;
                    }
                }
                while (start2 < end2) {
                    zArr2[start2] = true;
                    start2++;
                }
            }
        }
        StringBuilder sb4 = new StringBuilder();
        int length6 = desc.length();
        for (int i6 = 0; i6 < length6; i6++) {
            if (!zArr2[i6]) {
                sb4.append(desc.charAt(i6));
            }
        }
        String sb5 = sb4.toString();
        o.LJIIIIZZ(sb5, "content.toString()");
        int length7 = sb5.length() - 1;
        int i7 = 0;
        boolean z14 = false;
        while (i7 <= length7) {
            if (!z14) {
                i = i7;
            } else {
                i = length7;
            }
            if (o.LJIIJJI(sb5.charAt(i), 32) <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z14) {
                if (!z3) {
                    z14 = true;
                } else {
                    i7++;
                }
            } else {
                if (!z3) {
                    break;
                }
                length7--;
            }
        }
        return C132805Jc.LIZJ(length7, 1, sb5, i7);
    }

    public static final String LIZJ(Aweme aweme) {
        String language;
        String srcLanguage = "";
        if (aweme == null) {
            return "";
        }
        if (TextUtils.isEmpty(aweme.getDescLanguage()) || TextUtils.equals("un", aweme.getDescLanguage())) {
            User author = aweme.getAuthor();
            if (author != null && (language = author.getLanguage()) != null) {
                srcLanguage = language;
            }
        } else {
            srcLanguage = aweme.getDescLanguage();
        }
        if (o.LJ(srcLanguage, "zh")) {
            srcLanguage = "zh-Hans";
        }
        o.LJIIIIZZ(srcLanguage, "srcLanguage");
        return srcLanguage;
    }
}
