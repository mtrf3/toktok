package X;

import Y.IDComparatorS31S0000000_3;
import android.content.Context;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.84p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054784p {
    public static final /* synthetic */ int LIZ = 0;

    public static C2054684o LIZ(Context context, String str, List list) {
        o.LJIIIZ(context, "context");
        if (str == null || str.length() == 0 || list == null || list.isEmpty()) {
            AnonymousClass850[] anonymousClass850Arr = new AnonymousClass850[1];
            if (str == null) {
                str = "";
            }
            anonymousClass850Arr[0] = C2055784z.LIZIZ(str);
            List blocks = ORY.LJJZZIII(anonymousClass850Arr);
            o.LJIIIZ(blocks, "blocks");
            return new C2054684o(blocks);
        }
        return new C2054684o(LIZJ(context, str, list));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2054684o LIZIZ(android.content.Context r12, java.lang.String r13, java.util.List r14) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r2 = 0
            r6 = 1
            if (r13 == 0) goto Lf
            int r0 = r13.length()
            if (r0 != 0) goto L2a
        Lf:
            X.850[] r1 = new X.AnonymousClass850[r6]
            if (r13 != 0) goto L15
            java.lang.String r13 = ""
        L15:
            X.850 r0 = X.C2055784z.LIZIZ(r13)
            r1[r2] = r0
            java.util.List r1 = X.ORY.LJJZZIII(r1)
            java.lang.String r0 = "blocks"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.84o r0 = new X.84o
            r0.<init>(r1)
            return r0
        L2a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4a
            r4.<init>(r13)     // Catch: org.json.JSONException -> L4a
            int r3 = r4.length()     // Catch: org.json.JSONException -> L4a
            r2 = 0
        L39:
            if (r2 >= r3) goto L4e
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r4, r2)     // Catch: org.json.JSONException -> L4a
            java.lang.String r0 = "jsonArray.getString(i)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: org.json.JSONException -> L4a
            r5.add(r1)     // Catch: org.json.JSONException -> L4a
            int r2 = r2 + 1
            goto L39
        L4a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L4e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r11 = r5.iterator()
            r3 = 0
        L58:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r10 = r11.next()
            int r9 = r3 + 1
            r7 = 0
            if (r3 < 0) goto Lb8
            java.lang.String r10 = (java.lang.String) r10
            if (r14 == 0) goto L91
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r14.iterator()
        L74:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.model.TextExtraStruct r0 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r0
            int r0 = r0.getLineIndex()
            if (r0 != r3) goto L74
            r8.add(r1)
            goto L74
        L8b:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto Lb0
        L91:
            X.850 r0 = X.C2055784z.LIZIZ(r10)
            r4.add(r0)
        L98:
            int r0 = r5.size()
            int r0 = r0 - r6
            if (r3 >= r0) goto Lae
        La0:
            X.850 r3 = new X.850
            X.853 r2 = X.AnonymousClass853.WRAP
            r1 = 10
            java.lang.String r0 = "\n"
            r3.<init>(r0, r7, r2, r1)
            r4.add(r3)
        Lae:
            r3 = r9
            goto L58
        Lb0:
            java.util.List r0 = LIZJ(r12, r10, r8)
            r4.addAll(r0)
            goto L98
        Lb8:
            X.C47261Igj.LJJJJJ()
            throw r7
        Lbc:
            X.84o r0 = new X.84o
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2054784p.LIZIZ(android.content.Context, java.lang.String, java.util.List):X.84o");
    }

    public static List LIZJ(Context context, String str, List list) {
        int i;
        int type;
        int end;
        boolean z;
        int i2;
        int i3;
        int end2;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
            int start = textExtraStruct.getStart();
            if (start >= 0 && start < length && (end2 = textExtraStruct.getEnd()) >= 0 && end2 <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                arrayList2.add(obj);
            }
        }
        List<TextExtraStruct> LLILII = ORZ.LLILII(new IDComparatorS31S0000000_3(1), arrayList2);
        LLILII.size();
        list.size();
        int i4 = 0;
        for (TextExtraStruct textExtraStruct2 : LLILII) {
            if (textExtraStruct2.getStart() >= i4 || i4 == 0) {
                if (textExtraStruct2.getStart() > i4) {
                    String substring = str.substring(i4, textExtraStruct2.getStart());
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(C2055784z.LIZIZ(substring));
                }
                String substring2 = str.substring(textExtraStruct2.getStart(), textExtraStruct2.getEnd());
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int type2 = textExtraStruct2.getType();
                int i5 = 42;
                if (type2 != 0 && type2 != 1) {
                    if (type2 != 2) {
                        if (type2 != 3) {
                            if (type2 != 5) {
                                if (type2 != 6) {
                                    if (type2 != 65282) {
                                        i4 = textExtraStruct2.getStart();
                                    } else {
                                        int color = textExtraStruct2.getColor();
                                        if (!textExtraStruct2.isBoldText()) {
                                            i5 = 41;
                                        }
                                        arrayList.add(C2055784z.LIZ(substring2, color, i5, textExtraStruct2, AnonymousClass853.CUSTOM_CLICK_SPAN));
                                    }
                                } else {
                                    arrayList.add(C2055784z.LIZ(substring2, 0, 42, textExtraStruct2, AnonymousClass853.SEARCH_TOP));
                                }
                            }
                        } else {
                            Integer LJI = C79045V0n.LJI(R.attr.go, context);
                            if (LJI != null) {
                                i3 = LJI.intValue();
                            } else {
                                i3 = 0;
                            }
                            arrayList.add(C2055784z.LIZ(substring2, i3, 42, textExtraStruct2, AnonymousClass853.HASHTAG));
                        }
                    } else {
                        Integer LJI2 = C79045V0n.LJI(R.attr.go, context);
                        if (LJI2 != null) {
                            i2 = LJI2.intValue();
                        } else {
                            i2 = 0;
                        }
                        arrayList.add(C2055784z.LIZ(substring2, i2, 42, textExtraStruct2, AnonymousClass853.HASHTAG));
                    }
                    type = textExtraStruct2.getType();
                    end = textExtraStruct2.getEnd();
                    if (type == 0 && type != 1 && type != 2 && type != 3 && type != 5) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (end >= str.length() && str.charAt(end) == ' ' && z) {
                        arrayList.add(C2055784z.LIZ);
                        i4 = textExtraStruct2.getEnd() + 1;
                    } else {
                        i4 = textExtraStruct2.getEnd();
                    }
                }
                Integer LJI3 = C79045V0n.LJI(R.attr.e4, context);
                if (LJI3 != null) {
                    i = LJI3.intValue();
                } else {
                    i = 0;
                }
                arrayList.add(C2055784z.LIZ(substring2, i, 42, textExtraStruct2, AnonymousClass853.HASHTAG));
                type = textExtraStruct2.getType();
                end = textExtraStruct2.getEnd();
                if (type == 0) {
                }
                z = true;
                if (end >= str.length()) {
                }
                i4 = textExtraStruct2.getEnd();
            }
        }
        if (i4 < length) {
            String substring3 = str.substring(i4, length);
            o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(C2055784z.LIZIZ(substring3));
        }
        return arrayList;
    }
}
