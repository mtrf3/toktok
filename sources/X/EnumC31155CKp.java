package X;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SHOW' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.CKp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31155CKp {
    public static final /* synthetic */ EnumC31155CKp[] LJLJI;
    public static final EnumC31155CKp SHOW;
    public static final EnumC31155CKp TOAST;
    public String LJLIL;
    public List<C31152CKm> LJLILLLLZI;

    public static EnumC31155CKp valueOf(String str) {
        return (EnumC31155CKp) V0N.LJJJ(EnumC31155CKp.class, str);
    }

    public static EnumC31155CKp[] values() {
        return (EnumC31155CKp[]) LJLJI.clone();
    }

    static {
        LinkedList linkedList = new LinkedList();
        EnumC31157CKr enumC31157CKr = EnumC31157CKr.YES;
        EnumC31157CKr enumC31157CKr2 = EnumC31157CKr.WHATEVER;
        linkedList.add(new C31152CKm(enumC31157CKr, enumC31157CKr2, enumC31157CKr, enumC31157CKr2, enumC31157CKr));
        linkedList.add(new C31152CKm(EnumC31157CKr.NO, enumC31157CKr2, enumC31157CKr, enumC31157CKr, enumC31157CKr));
        EnumC31155CKp enumC31155CKp = new EnumC31155CKp("SHOW", 0, "Show the gift icon", linkedList);
        SHOW = enumC31155CKp;
        EnumC31155CKp enumC31155CKp2 = new EnumC31155CKp("TOAST", 1, "Show the toast but not the low age Dialog", null);
        TOAST = enumC31155CKp2;
        LJLJI = new EnumC31155CKp[]{enumC31155CKp, enumC31155CKp2};
    }

    public final String getDescription() {
        return this.LJLIL;
    }

    public final List<C31152CKm> getMStatusSets() {
        return this.LJLILLLLZI;
    }

    public final void setDescription(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setMStatusSets(List<C31152CKm> list) {
        this.LJLILLLLZI = list;
    }

    public EnumC31155CKp(String str, int i, String str2, List list) {
        this.LJLIL = str2;
        this.LJLILLLLZI = list;
    }
}
