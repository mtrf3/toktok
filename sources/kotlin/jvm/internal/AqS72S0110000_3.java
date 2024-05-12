package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C40517FvF;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC88471Ynr;
import X.OSZ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ujb.s;

/* loaded from: classes4.dex */
public class AqS72S0110000_3 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS72S0110000_3(List list, List<String> list2, boolean z) {
        super(2);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.z1 = list2;
    }

    public static final Object invoke$0(AqS72S0110000_3 aqS72S0110000_3, Object obj, Object obj2) {
        String eventName = (String) obj;
        C188727au eventMaoBuilder = (C188727au) obj2;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(eventMaoBuilder, "eventMaoBuilder");
        if (!aqS72S0110000_3.z1) {
            FMX.LJIIL(eventName, eventMaoBuilder.LIZ);
            ((FeedSearchBottomBarAssemTrigger) aqS72S0110000_3.l0).l4();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS72S0110000_3 aqS72S0110000_3, Object obj, Object obj2) {
        OSZ osz;
        CharSequence $receiver = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ($receiver, "$this$$receiver");
        List list = (List) aqS72S0110000_3.l0;
        boolean z = aqS72S0110000_3.z1;
        if (!z && list.size() == 1) {
            int size = list.size();
            if (size != 0) {
                if (size == 1) {
                    String str = (String) ListProtector.get(list, 0);
                    int LJJLIIIJL = s.LJJLIIIJL($receiver, str, intValue, false, 4);
                    if (LJJLIIIJL < 0) {
                        return null;
                    }
                    osz = new OSZ(Integer.valueOf(LJJLIIIJL), str);
                } else {
                    throw new IllegalArgumentException("List has more than one element.");
                }
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            C40517FvF c40517FvF = new C40517FvF(intValue, $receiver.length());
            if ($receiver instanceof String) {
                int i = c40517FvF.LJLILLLLZI;
                int i2 = c40517FvF.LJLJI;
                if (i2 > 0) {
                    if (intValue > i) {
                        return null;
                    }
                } else if (i2 >= 0 || i > intValue) {
                    return null;
                }
                while (true) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        String str2 = (String) next;
                        if (ujb.o.LJJJJL(str2, 0, z, intValue, str2.length(), (String) $receiver)) {
                            if (next != null) {
                                osz = new OSZ(Integer.valueOf(intValue), next);
                                break;
                            }
                        }
                    }
                    if (intValue == i) {
                        return null;
                    }
                    intValue += i2;
                }
            } else {
                int i3 = c40517FvF.LJLILLLLZI;
                int i4 = c40517FvF.LJLJI;
                if (i4 > 0) {
                    if (intValue > i3) {
                        return null;
                    }
                } else if (i4 >= 0 || i3 > intValue) {
                    return null;
                }
                while (true) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        String str3 = (String) next2;
                        if (s.LJJLJLI(str3, 0, $receiver, intValue, str3.length(), z)) {
                            if (next2 != null) {
                                osz = new OSZ(Integer.valueOf(intValue), next2);
                                break;
                            }
                        }
                    }
                    if (intValue == i3) {
                        return null;
                    }
                    intValue += i4;
                }
            }
        }
        return new OSZ(osz.getFirst(), Integer.valueOf(((String) osz.getSecond()).length()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0110000_3(boolean z, FeedSearchBottomBarAssemTrigger feedSearchBottomBarAssemTrigger, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = feedSearchBottomBarAssemTrigger;
    }
}
