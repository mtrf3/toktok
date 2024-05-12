package com.ss.android.ugc.feed.platform.popupclean.v2.nuj.dialogclean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.feed.platform.popupclean.v2.nuj.dialogclean.NewUserPopupCleanRule;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NewUserPopupGroupSetting {
    public static final NewUserPopupGroupSetting LIZ = new NewUserPopupGroupSetting();
    public static boolean LIZIZ;

    /* loaded from: classes2.dex */
    public static final class PopupRuleGroup {

        @InterfaceC65349Pkn("new_user_groups")
        public final List<NewUserPopupCleanRule.RuleGroup> ruleGroup;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PopupRuleGroup) && o.LJ(this.ruleGroup, ((PopupRuleGroup) obj).ruleGroup);
        }

        public final int hashCode() {
            return this.ruleGroup.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PopupRuleGroup(ruleGroup=");
            return C1NE.LIZIZ(LIZ, this.ruleGroup, ')', LIZ);
        }

        public PopupRuleGroup(List<NewUserPopupCleanRule.RuleGroup> ruleGroup) {
            o.LJIIIZ(ruleGroup, "ruleGroup");
            this.ruleGroup = ruleGroup;
        }
    }
}
