package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C1NE;
import X.C35671DzH;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcomRequestParamVerifierConfig {
    public static final EcomRequestParamVerifierModel LIZ = new EcomRequestParamVerifierModel(null, null, null);

    /* loaded from: classes7.dex */
    public static final class EcomRequestParamVerifierModel {

        @InterfaceC65349Pkn("enable_notification")
        public final Boolean enableNotification;

        @InterfaceC65349Pkn("enable_verification")
        public final Boolean enableVerification;

        @InterfaceC65349Pkn("verification_rules")
        public final List<VerificationRule> verificationRules;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcomRequestParamVerifierModel copy$default(EcomRequestParamVerifierModel ecomRequestParamVerifierModel, Boolean bool, Boolean bool2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = ecomRequestParamVerifierModel.enableVerification;
            }
            if ((i & 2) != 0) {
                bool2 = ecomRequestParamVerifierModel.enableNotification;
            }
            if ((i & 4) != 0) {
                list = ecomRequestParamVerifierModel.verificationRules;
            }
            return ecomRequestParamVerifierModel.copy(bool, bool2, list);
        }

        public final EcomRequestParamVerifierModel copy(Boolean bool, Boolean bool2, List<VerificationRule> list) {
            return new EcomRequestParamVerifierModel(bool, bool2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomRequestParamVerifierModel)) {
                return false;
            }
            EcomRequestParamVerifierModel ecomRequestParamVerifierModel = (EcomRequestParamVerifierModel) obj;
            return o.LJ(this.enableVerification, ecomRequestParamVerifierModel.enableVerification) && o.LJ(this.enableNotification, ecomRequestParamVerifierModel.enableNotification) && o.LJ(this.verificationRules, ecomRequestParamVerifierModel.verificationRules);
        }

        public int hashCode() {
            Boolean bool = this.enableVerification;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.enableNotification;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            List<VerificationRule> list = this.verificationRules;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final Map<String, List<Rule>> getVerifierPaths() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<VerificationRule> list = this.verificationRules;
            if (list != null) {
                for (VerificationRule verificationRule : list) {
                    linkedHashMap.put(verificationRule.getPath(), verificationRule.getRules());
                }
            }
            return linkedHashMap;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomRequestParamVerifierModel(enableVerification=");
            LIZ.append(this.enableVerification);
            LIZ.append(", enableNotification=");
            LIZ.append(this.enableNotification);
            LIZ.append(", verificationRules=");
            return C1NE.LIZIZ(LIZ, this.verificationRules, ')', LIZ);
        }

        public final Boolean getEnableNotification() {
            return this.enableNotification;
        }

        public final Boolean getEnableVerification() {
            return this.enableVerification;
        }

        public final List<VerificationRule> getVerificationRules() {
            return this.verificationRules;
        }

        public EcomRequestParamVerifierModel(Boolean bool, Boolean bool2, List<VerificationRule> list) {
            this.enableVerification = bool;
            this.enableNotification = bool2;
            this.verificationRules = list;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Rule {
        public static final int DEFAULT = 0;
        public static final C35671DzH ParamsType = new C35671DzH();

        @InterfaceC65349Pkn("empty")
        public final Boolean empty;

        @InterfaceC65349Pkn("key")
        public final String key;

        @InterfaceC65349Pkn("required")
        public final Boolean required;

        @InterfaceC65349Pkn("type")
        public final Integer type;

        public static /* synthetic */ Rule copy$default(Rule rule, String str, Boolean bool, Integer num, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rule.key;
            }
            if ((i & 2) != 0) {
                bool = rule.required;
            }
            if ((i & 4) != 0) {
                num = rule.type;
            }
            if ((i & 8) != 0) {
                bool2 = rule.empty;
            }
            return rule.copy(str, bool, num, bool2);
        }

        public final Rule copy(String str, Boolean bool, Integer num, Boolean bool2) {
            return new Rule(str, bool, num, bool2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) obj;
            return o.LJ(this.key, rule.key) && o.LJ(this.required, rule.required) && o.LJ(this.type, rule.type) && o.LJ(this.empty, rule.empty);
        }

        public int hashCode() {
            String str = this.key;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.required;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.type;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool2 = this.empty;
            return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Rule(key=");
            LIZ.append(this.key);
            LIZ.append(", required=");
            LIZ.append(this.required);
            LIZ.append(", type=");
            LIZ.append(this.type);
            LIZ.append(", empty=");
            return C78920UyC.LIZIZ(LIZ, this.empty, ')', LIZ);
        }

        public final Boolean getEmpty() {
            return this.empty;
        }

        public final String getKey() {
            return this.key;
        }

        public final Boolean getRequired() {
            return this.required;
        }

        public final Integer getType() {
            return this.type;
        }

        public Rule(String str, Boolean bool, Integer num, Boolean bool2) {
            this.key = str;
            this.required = bool;
            this.type = num;
            this.empty = bool2;
        }
    }

    /* loaded from: classes7.dex */
    public static final class VerificationRule {

        @InterfaceC65349Pkn("path")
        public final String path;

        @InterfaceC65349Pkn("rules")
        public final List<Rule> rules;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VerificationRule copy$default(VerificationRule verificationRule, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verificationRule.path;
            }
            if ((i & 2) != 0) {
                list = verificationRule.rules;
            }
            return verificationRule.copy(str, list);
        }

        public final VerificationRule copy(String str, List<Rule> list) {
            return new VerificationRule(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerificationRule)) {
                return false;
            }
            VerificationRule verificationRule = (VerificationRule) obj;
            return o.LJ(this.path, verificationRule.path) && o.LJ(this.rules, verificationRule.rules);
        }

        public int hashCode() {
            String str = this.path;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Rule> list = this.rules;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VerificationRule(path=");
            LIZ.append(this.path);
            LIZ.append(", rules=");
            return C1NE.LIZIZ(LIZ, this.rules, ')', LIZ);
        }

        public final String getPath() {
            return this.path;
        }

        public final List<Rule> getRules() {
            return this.rules;
        }

        public VerificationRule(String str, List<Rule> list) {
            this.path = str;
            this.rules = list;
        }
    }
}
