package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.ss.android.ugc.aweme.plugin.clienttrigger.MatchProperty;
import com.ss.android.ugc.aweme.plugin.clienttrigger.NumberMatchProperties;
import com.ss.android.ugc.aweme.plugin.clienttrigger.StringMatchProperties;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.E1v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC35763E1v {
    public abstract String LIZJ();

    public abstract java.util.Map<String, Object> LIZLLL();

    public final boolean LIZ(List<MatchProperty> list) {
        String str;
        boolean LJJJLZIJ;
        Object obj;
        java.util.Map<String, Object> LIZLLL = LIZLLL();
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (!(!list.isEmpty()) || (LIZLLL != null && !LIZLLL.isEmpty())) {
            for (MatchProperty matchProperty : list) {
                int value = matchProperty.type.getValue();
                if (value == MatchProperty.MatchTypeEnum.StringMatch.getValue()) {
                    Object obj2 = null;
                    if (LIZLLL != null) {
                        obj2 = LIZLLL.get(matchProperty.propertyName);
                    }
                    if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                        return false;
                    }
                    StringMatchProperties stringMatchProperties = matchProperty.stringMatchProperties;
                    o.LJI(stringMatchProperties);
                    String str2 = stringMatchProperties.value;
                    int value2 = stringMatchProperties.matchType.getValue();
                    if (value2 == StringMatchProperties.StringMatchType.Equals.getValue()) {
                        if (str.compareTo(str2) != 0) {
                            return false;
                        }
                    } else if (value2 == StringMatchProperties.StringMatchType.GreaterThan.getValue()) {
                        if (str.compareTo(str2) <= 0) {
                            return false;
                        }
                    } else if (value2 == StringMatchProperties.StringMatchType.GreatThanOrEquals.getValue()) {
                        if (str.compareTo(str2) < 0) {
                            return false;
                        }
                    } else if (value2 == StringMatchProperties.StringMatchType.LessThan.getValue()) {
                        if (str.compareTo(str2) >= 0) {
                            return false;
                        }
                    } else if (value2 == StringMatchProperties.StringMatchType.LessThanOrEquals.getValue()) {
                        if (str.compareTo(str2) > 0) {
                            return false;
                        }
                    } else {
                        if (value2 == StringMatchProperties.StringMatchType.Contains.getValue()) {
                            LJJJLZIJ = s.LJJJLZIJ(str, str2, false);
                        } else {
                            if (value2 != StringMatchProperties.StringMatchType.ContainedIn.getValue()) {
                                return false;
                            }
                            LJJJLZIJ = s.LJJJLZIJ(str, str2, false);
                        }
                        if (!LJJJLZIJ) {
                            return false;
                        }
                    }
                } else {
                    if (value == MatchProperty.MatchTypeEnum.NumberMatch.getValue() && LIZLLL != null && (obj = LIZLLL.get(matchProperty.propertyName)) != null) {
                        if (obj instanceof Number) {
                            NumberMatchProperties numberMatchProperties = matchProperty.numberMatchProperties;
                            o.LJI(numberMatchProperties);
                            if (!LIZIZ(numberMatchProperties, ((Number) obj).doubleValue())) {
                                return false;
                            }
                        } else if (obj instanceof String) {
                            try {
                                double parseDouble = CastDoubleProtector.parseDouble((String) obj);
                                NumberMatchProperties numberMatchProperties2 = matchProperty.numberMatchProperties;
                                o.LJI(numberMatchProperties2);
                                if (!LIZIZ(numberMatchProperties2, parseDouble)) {
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(NumberMatchProperties numberMatchProperties, double d) {
        double d2 = numberMatchProperties.value;
        int value = numberMatchProperties.matchType.getValue();
        if (value != NumberMatchProperties.DoubleMatchType.Equals.getValue() ? !(value != NumberMatchProperties.DoubleMatchType.GreaterThan.getValue() ? value != NumberMatchProperties.DoubleMatchType.GreatThanOrEquals.getValue() ? value != NumberMatchProperties.DoubleMatchType.LessThan.getValue() ? value != NumberMatchProperties.DoubleMatchType.LessThanOrEquals.getValue() || d > d2 : d >= d2 : d < d2 : d <= d2) : d == d2) {
            return true;
        }
        return false;
    }
}
