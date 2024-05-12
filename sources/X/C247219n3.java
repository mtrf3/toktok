package X;

import Y.ACListenerS17S0301000_4;
import Y.ACListenerS22S0201000_4;
import Y.ACListenerS39S0200000_4;
import Y.IDCListenerS280S0100000_4;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.invitecode.InviteCodeResponse;
import com.bytedance.touchpoint.core.model.IncentiveCommon;
import com.bytedance.touchpoint.core.model.Title;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9n3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247219n3 {
    public static TuxSheet LIZ;

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.GradientDrawable LIZ(com.bytedance.touchpoint.core.invitecode.InviteCodeResponse.Button r8) {
        /*
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r6 = 0
            if (r8 == 0) goto Lbc
            int r1 = r8.gradientType
            r5 = 0
            if (r1 != 0) goto L2f
            if (r8 == 0) goto Lbc
            java.util.List<java.lang.String> r0 = r8.bgColor
            if (r0 == 0) goto Lbc
            int r0 = r0.size()
            if (r0 <= 0) goto Lbc
            X.9nU r1 = X.C247489nU.LIZ
            if (r8 == 0) goto L27
            java.util.List<java.lang.String> r0 = r8.bgColor
            if (r0 == 0) goto L27
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            java.lang.String r5 = (java.lang.String) r5
        L27:
            int r0 = X.C247489nU.LIZIZ(r1, r5)
        L2b:
            r3.setColor(r0)
        L2e:
            return r3
        L2f:
            r0 = 1
            if (r1 == r0) goto L75
            r0 = 2
            if (r1 == r0) goto L72
            r0 = 3
            if (r1 == r0) goto L6f
            r0 = 4
            if (r1 == r0) goto L6c
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
        L3d:
            if (r8 == 0) goto L78
            java.util.List<java.lang.String> r1 = r8.bgColor
            if (r1 == 0) goto L78
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r7.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.9nU r0 = X.C247489nU.LIZ
            int r0 = X.C247489nU.LIZIZ(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.add(r0)
            goto L52
        L6c:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            goto L3d
        L6f:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            goto L3d
        L72:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            goto L3d
        L75:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            goto L3d
        L78:
            r7 = r5
            if (r8 == 0) goto Lba
        L7b:
            java.util.List<java.lang.Float> r2 = r8.locations
        L7d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto Lb0
            if (r2 == 0) goto Lb0
            int r0 = r2.size()
            if (r0 <= 0) goto Lb0
            if (r7 == 0) goto Lae
            int[] r0 = X.ORZ.LLJ(r7)
        L91:
            if (r2 == 0) goto L97
            float[] r5 = X.ORZ.LLIZ(r2)
        L97:
            r3.setColors(r0, r5)
        L9a:
            r3.setGradientType(r6)
            r3.setOrientation(r4)
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            r3.setCornerRadius(r0)
            goto L2e
        Lae:
            r0 = r5
            goto L91
        Lb0:
            if (r7 == 0) goto Lb6
            int[] r5 = X.ORZ.LLJ(r7)
        Lb6:
            r3.setColors(r5)
            goto L9a
        Lba:
            r2 = r5
            goto L7d
        Lbc:
            X.9nU r1 = X.C247489nU.LIZ
            java.lang.String r0 = "#FFFFFF"
            int r0 = X.C247489nU.LIZIZ(r1, r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247219n3.LIZ(com.bytedance.touchpoint.core.invitecode.InviteCodeResponse$Button):android.graphics.drawable.GradientDrawable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v86, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.bytedance.touchpoint.core.invitecode.InviteCodeResponse$Button] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.bytedance.touchpoint.core.invitecode.InviteCodeResponse$Button] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.widget.TextView, X.SY4, android.view.View] */
    public static void LIZIZ(Activity activity, InviteCodeResponse inviteCodeResponse, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC65784Pro interfaceC65784Pro) {
        String str;
        String str2;
        String str3;
        InviteCodeResponse.InviteResultPopup inviteResultPopup;
        int i;
        String str4;
        String str5;
        InviteCodeResponse.UserInfo userInfo;
        InviteCodeResponse.UserInfo userInfo2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        InviteCodeResponse.Button button;
        InviteCodeResponse.InviteResultPopup inviteResultPopup2;
        List<InviteCodeResponse.Button> list;
        int size;
        Object obj;
        ?? r0;
        Title title;
        InviteCodeResponse.InviteResultPopup inviteResultPopup3;
        List<InviteCodeResponse.Button> list2;
        InviteCodeResponse.InviteResultPopup inviteResultPopup4;
        List<InviteCodeResponse.Button> list3;
        InviteCodeResponse.InviteResultPopup inviteResultPopup5;
        List<InviteCodeResponse.Button> list4;
        InviteCodeResponse.Button button2;
        Title title2;
        InviteCodeResponse.InviteResultPopup inviteResultPopup6;
        List<InviteCodeResponse.Button> list5;
        InviteCodeResponse.Button button3;
        Title title3;
        InviteCodeResponse.InviteResultPopup inviteResultPopup7;
        Title title4;
        InviteCodeResponse.InviteResultPopup inviteResultPopup8;
        Title title5;
        InviteCodeResponse.InviteResultPopup inviteResultPopup9;
        Title title6;
        InviteCodeResponse.InviteResultPopup inviteResultPopup10;
        Title title7;
        String str12;
        InviteCodeResponse.InviteResultPopup inviteResultPopup11;
        Integer num;
        if (activity != null) {
            InviteCodeResponse.Data data = inviteCodeResponse.data;
            AttributeSet attributeSet = null;
            if (data == null || data.inviteResultPopup == null) {
                return;
            }
            if (LIZ == null) {
                View layout = C16880lQ.LLLZIIL(R.layout.ct0, C16880lQ.LLZIL(activity), null);
                InviteCodeResponse.Data data2 = inviteCodeResponse.data;
                if (data2 != null && (num = data2.inviterBindStatus) != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                if (i == 2 || i == 1) {
                    o.LJIIIIZZ(layout, "layout");
                    ImageView imageView = (ImageView) layout.findViewById(R.id.bxs);
                    o.LJIIIIZZ(imageView, "layout.cover_image");
                    imageView.setVisibility(8);
                    View findViewById = layout.findViewById(R.id.esd);
                    o.LJIIIIZZ(findViewById, "layout.invite_user_layout");
                    findViewById.setVisibility(0);
                    C71799SFv c71799SFv = (C71799SFv) layout.findViewById(R.id.esq);
                    InviteCodeResponse.Data data3 = inviteCodeResponse.data;
                    if (data3 == null || (userInfo2 = data3.inviterInfo) == null || (str4 = userInfo2.avatarUrl) == null) {
                        str4 = "";
                    }
                    C71799SFv.LJIIJ(c71799SFv, str4, null, false, null, 110);
                    C71799SFv c71799SFv2 = (C71799SFv) layout.findViewById(R.id.eso);
                    InviteCodeResponse.Data data4 = inviteCodeResponse.data;
                    if (data4 == null || (userInfo = data4.inviteeInfo) == null || (str5 = userInfo.avatarUrl) == null) {
                        str5 = "";
                    }
                    C71799SFv.LJIIJ(c71799SFv2, str5, null, false, null, 110);
                } else {
                    o.LJIIIIZZ(layout, "layout");
                    ImageView imageView2 = (ImageView) layout.findViewById(R.id.bxs);
                    o.LJIIIIZZ(imageView2, "layout.cover_image");
                    imageView2.setVisibility(0);
                    View findViewById2 = layout.findViewById(R.id.esd);
                    o.LJIIIIZZ(findViewById2, "layout.invite_user_layout");
                    findViewById2.setVisibility(8);
                    W5G w5g = (W5G) layout.findViewById(R.id.bxs);
                    InviteCodeResponse.Data data5 = inviteCodeResponse.data;
                    if (data5 != null && (inviteResultPopup11 = data5.inviteResultPopup) != null) {
                        str12 = inviteResultPopup11.coverImage;
                    } else {
                        str12 = null;
                    }
                    w5g.setImageURI(str12);
                }
                TextView textView = (TextView) layout.findViewById(R.id.title);
                o.LJIIIIZZ(textView, "layout.title");
                InviteCodeResponse.Data data6 = inviteCodeResponse.data;
                if (data6 != null && (inviteResultPopup10 = data6.inviteResultPopup) != null && (title7 = inviteResultPopup10.title) != null) {
                    str6 = title7.text;
                } else {
                    str6 = null;
                }
                textView.setText(str6);
                TextView textView2 = (TextView) layout.findViewById(R.id.title);
                C247489nU c247489nU = C247489nU.LIZ;
                InviteCodeResponse.Data data7 = inviteCodeResponse.data;
                if (data7 != null && (inviteResultPopup9 = data7.inviteResultPopup) != null && (title6 = inviteResultPopup9.title) != null) {
                    str7 = title6.color;
                } else {
                    str7 = null;
                }
                textView2.setTextColor(C247489nU.LIZIZ(c247489nU, str7));
                TextView textView3 = (TextView) layout.findViewById(R.id.bst);
                o.LJIIIIZZ(textView3, "layout.content");
                InviteCodeResponse.Data data8 = inviteCodeResponse.data;
                if (data8 != null && (inviteResultPopup8 = data8.inviteResultPopup) != null && (title5 = inviteResultPopup8.decription) != null) {
                    str8 = title5.text;
                } else {
                    str8 = null;
                }
                textView3.setText(str8);
                TextView textView4 = (TextView) layout.findViewById(R.id.bst);
                InviteCodeResponse.Data data9 = inviteCodeResponse.data;
                if (data9 != null && (inviteResultPopup7 = data9.inviteResultPopup) != null && (title4 = inviteResultPopup7.decription) != null) {
                    str9 = title4.color;
                } else {
                    str9 = null;
                }
                textView4.setTextColor(C247489nU.LIZIZ(c247489nU, str9));
                TextView textView5 = (TextView) layout.findViewById(R.id.b1h);
                o.LJIIIIZZ(textView5, "layout.button");
                InviteCodeResponse.Data data10 = inviteCodeResponse.data;
                if (data10 != null && (inviteResultPopup6 = data10.inviteResultPopup) != null && (list5 = inviteResultPopup6.buttons) != null && (button3 = (InviteCodeResponse.Button) ListProtector.get(list5, 0)) != null && (title3 = button3.text) != null) {
                    str10 = title3.text;
                } else {
                    str10 = null;
                }
                textView5.setText(str10);
                TextView textView6 = (TextView) layout.findViewById(R.id.b1h);
                InviteCodeResponse.Data data11 = inviteCodeResponse.data;
                if (data11 != null && (inviteResultPopup5 = data11.inviteResultPopup) != null && (list4 = inviteResultPopup5.buttons) != null && (button2 = (InviteCodeResponse.Button) ListProtector.get(list4, 0)) != null && (title2 = button2.text) != null) {
                    str11 = title2.color;
                } else {
                    str11 = null;
                }
                textView6.setTextColor(C247489nU.LIZIZ(c247489nU, str11));
                View findViewById3 = layout.findViewById(R.id.b1h);
                o.LJIIIIZZ(findViewById3, "layout.button");
                InviteCodeResponse.Data data12 = inviteCodeResponse.data;
                if (data12 != null && (inviteResultPopup4 = data12.inviteResultPopup) != null && (list3 = inviteResultPopup4.buttons) != null) {
                    button = (InviteCodeResponse.Button) ListProtector.get(list3, 0);
                } else {
                    button = null;
                }
                findViewById3.setBackground(LIZ(button));
                C16880lQ.LJJIZ((SY4) layout.findViewById(R.id.b1h), new ACListenerS22S0201000_4(interfaceC88471Ynr, inviteCodeResponse, i, 3));
                InviteCodeResponse.Data data13 = inviteCodeResponse.data;
                if (data13 != null && (inviteResultPopup2 = data13.inviteResultPopup) != null && (list = inviteResultPopup2.buttons) != null && (size = list.size()) > 1) {
                    int i2 = -2;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins((int) KL2.LIZJ(activity, 32.0f), (int) KL2.LIZJ(activity, 32.0f), (int) KL2.LIZJ(activity, 32.0f), 0);
                    View findViewById4 = layout.findViewById(R.id.b1h);
                    o.LJIIIIZZ(findViewById4, "layout.button");
                    findViewById4.setLayoutParams(layoutParams);
                    int i3 = 1;
                    do {
                        InviteCodeResponse.Data data14 = inviteCodeResponse.data;
                        if (data14 != null && (inviteResultPopup3 = data14.inviteResultPopup) != null && (list2 = inviteResultPopup3.buttons) != null) {
                            obj = (InviteCodeResponse.Button) ListProtector.get(list2, i3);
                        } else {
                            obj = attributeSet;
                        }
                        ?? sy4 = new SY4(activity, attributeSet, 6, 0);
                        if (obj != null && (title = obj.text) != null) {
                            r0 = title.text;
                        } else {
                            r0 = attributeSet;
                        }
                        sy4.setText(r0);
                        sy4.setButtonSize(3);
                        sy4.setButtonVariant(0);
                        C247489nU c247489nU2 = C247489nU.LIZ;
                        ?? r14 = attributeSet;
                        if (obj != null) {
                            Title title8 = obj.text;
                            r14 = attributeSet;
                            if (title8 != null) {
                                r14 = title8.color;
                            }
                        }
                        sy4.setTextColor(C247489nU.LIZIZ(c247489nU2, r14));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i2);
                        layoutParams2.setMargins((int) KL2.LIZJ(activity, 32.0f), (int) KL2.LIZJ(activity, 6.0f), (int) KL2.LIZJ(activity, 32.0f), (int) KL2.LIZJ(activity, 32.0f));
                        ((ViewGroup) layout).addView(sy4, layoutParams2);
                        C16880lQ.LJJIZ(sy4, new ACListenerS17S0301000_4(interfaceC88471Ynr, obj, inviteCodeResponse, i, 3));
                        sy4.setBackground(LIZ(obj));
                        i3++;
                        attributeSet = null;
                        i2 = -2;
                    } while (i3 < size);
                }
                C16880lQ.LJJJ((TuxIconView) layout.findViewById(R.id.bf7), new ACListenerS39S0200000_4(layout, inviteCodeResponse, 123));
                ASL asl = new ASL();
                asl.LIZLLL(R.style.uy);
                asl.LIZ.LJLLI = layout;
                asl.LJI(0);
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLJ = true;
                tuxSheet.LJZI = false;
                tuxSheet.LJLIL = new IDCListenerS280S0100000_4(interfaceC65784Pro, 10);
                LIZ = tuxSheet;
            }
            if (activity instanceof ActivityC45651qj) {
                FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "if (activity is Fragment…agmentManager else return");
                TuxSheet tuxSheet2 = LIZ;
                if (tuxSheet2 != null) {
                    tuxSheet2.show(supportFragmentManager, "invite_dialog");
                }
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    InviteCodeResponse.Data data15 = inviteCodeResponse.data;
                    if (data15 != null && (inviteResultPopup = data15.inviteResultPopup) != null) {
                        str = inviteResultPopup.popupType;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put("pop_name", str);
                    linkedHashMap.put("position", "now tab");
                    IncentiveCommon incentiveCommon = (IncentiveCommon) C2MW.LIZ().LIZLLL(23);
                    if (incentiveCommon != null) {
                        str2 = incentiveCommon.notificationName;
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put("activity_name", str2);
                    AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                    if (abstractC247499nV != null) {
                        str3 = abstractC247499nV.LJIIJ();
                    } else {
                        str3 = null;
                    }
                    linkedHashMap.put("region", str3);
                    interfaceC247459nR.LIZIZ("referral_dialog_pop_show", linkedHashMap);
                }
            }
        }
    }
}
