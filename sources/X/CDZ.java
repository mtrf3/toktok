package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CDZ extends CDI {
    public final C30958CDa LJLIL;
    public final /* synthetic */ CDT LJLILLLLZI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CDZ(X.CDT r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r3.LJLILLLLZI = r4
            X.CDa r2 = new X.CDa
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r3.<init>(r2)
            android.view.View r1 = r3.itemView
            boolean r0 = r1 instanceof X.C30958CDa
            if (r0 == 0) goto L23
            X.CDa r1 = (X.C30958CDa) r1
        L20:
            r3.LJLIL = r1
            return
        L23:
            r1 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CDZ.<init>(X.CDT, android.view.ViewGroup):void");
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        C47121t6 c47121t6;
        View badgeLine;
        C47121t6 badgeStr;
        ImageModel imageModel;
        CombineBadgeStruct combineBadgeStruct;
        CombineBadgeStruct combineBadgeStruct2;
        String str;
        C47121t6 badgeStr2;
        String str2;
        CombineBadgeStruct combineBadgeStruct3;
        C47121t6 badgeStr3;
        C47121t6 des;
        String str3;
        LinearLayout badgeContainer;
        View badgeLine2;
        o.LJIIIZ(holder, "holder");
        SubLevel subLevel = (SubLevel) ORZ.LJLLLLLL(i, this.LJLILLLLZI.LJLIL);
        if (subLevel == null) {
            return;
        }
        C30958CDa c30958CDa = this.LJLIL;
        C47061t0 c47061t0 = null;
        if (c30958CDa != null) {
            c47121t6 = c30958CDa.getBadgeStr();
        } else {
            c47121t6 = null;
        }
        C23010vJ.LJ(700, c47121t6);
        if (i == ((ArrayList) this.LJLILLLLZI.LJLIL).size() - 1) {
            C30958CDa c30958CDa2 = this.LJLIL;
            if (c30958CDa2 != null && (badgeLine2 = c30958CDa2.getBadgeLine()) != null) {
                badgeLine2.setVisibility(8);
            }
        } else {
            C30958CDa c30958CDa3 = this.LJLIL;
            if (c30958CDa3 != null && (badgeLine = c30958CDa3.getBadgeLine()) != null) {
                badgeLine.setVisibility(0);
            }
        }
        if (i == 0) {
            C30958CDa c30958CDa4 = this.LJLIL;
            if (c30958CDa4 != null) {
                c30958CDa4.setItemScale(1.0f);
            }
        } else {
            C30958CDa c30958CDa5 = this.LJLIL;
            if (c30958CDa5 != null) {
                c30958CDa5.setItemScale(0.72f);
            }
        }
        List<C30959CDb> list = C30960CDc.LIZ;
        C30959CDb c30959CDb = (C30959CDb) ORZ.LJLLLLLL(i, list);
        if (c30959CDb == null) {
            c30959CDb = (C30959CDb) ListProtector.get(list, ((ArrayList) list).size() - 1);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{C29716BlQ.LIZIZ(c30959CDb.LIZ), C29716BlQ.LIZIZ(c30959CDb.LIZIZ)});
        if (C29306Beo.LJIJJLI(c30959CDb.LIZJ)) {
            gradientDrawable.setStroke(C15380j0.LIZ(1.5f), C29716BlQ.LIZIZ(c30959CDb.LIZJ));
        }
        gradientDrawable.setCornerRadius(this.LJLILLLLZI.LJLILLLLZI);
        C30958CDa c30958CDa6 = this.LJLIL;
        if (c30958CDa6 != null && (badgeContainer = c30958CDa6.getBadgeContainer()) != null) {
            badgeContainer.setBackground(gradientDrawable);
        }
        C30958CDa c30958CDa7 = this.LJLIL;
        if (c30958CDa7 != null && (des = c30958CDa7.getDes()) != null) {
            SubLevel subLevel2 = (SubLevel) ORZ.LJLLLLLL(i, this.LJLILLLLZI.LJLIL);
            if (subLevel2 == null || (str3 = subLevel2.desc) == null) {
                str3 = "";
            }
            des.setText(str3);
        }
        BadgeStruct badgeStruct = subLevel.badgeStruct;
        if (badgeStruct == null || (combineBadgeStruct2 = badgeStruct.combineBadgeStruct) == null || (str = combineBadgeStruct2.str) == null || str.length() == 0) {
            C30958CDa c30958CDa8 = this.LJLIL;
            if (c30958CDa8 != null && (badgeStr = c30958CDa8.getBadgeStr()) != null) {
                badgeStr.setVisibility(8);
            }
        } else {
            C30958CDa c30958CDa9 = this.LJLIL;
            if (c30958CDa9 != null && (badgeStr3 = c30958CDa9.getBadgeStr()) != null) {
                badgeStr3.setVisibility(0);
            }
            C30958CDa c30958CDa10 = this.LJLIL;
            if (c30958CDa10 != null && (badgeStr2 = c30958CDa10.getBadgeStr()) != null) {
                BadgeStruct badgeStruct2 = subLevel.badgeStruct;
                if (badgeStruct2 != null && (combineBadgeStruct3 = badgeStruct2.combineBadgeStruct) != null) {
                    str2 = combineBadgeStruct3.str;
                } else {
                    str2 = null;
                }
                badgeStr2.setText(str2);
            }
        }
        BQO LIZ = C15650jR.LIZ();
        BadgeStruct badgeStruct3 = subLevel.badgeStruct;
        if (badgeStruct3 != null && (combineBadgeStruct = badgeStruct3.combineBadgeStruct) != null) {
            imageModel = combineBadgeStruct.icon;
        } else {
            imageModel = null;
        }
        C78720Uuy LJIIIZ = LIZ.LJIIIZ(imageModel);
        C30958CDa c30958CDa11 = this.LJLIL;
        if (c30958CDa11 != null) {
            c47061t0 = c30958CDa11.getBadgeIcon();
        }
        LJIIIZ.LJIIJJI(c47061t0);
    }
}
