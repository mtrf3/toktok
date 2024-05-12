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
/* renamed from: X.CKo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31154CKo {
    public static final EnumC31154CKo GREY;
    public static final EnumC31154CKo HIDE;
    public static final /* synthetic */ EnumC31154CKo[] LJLJI;
    public static final EnumC31154CKo SHOW;
    public String LJLIL;
    public List<C31152CKm> LJLILLLLZI;

    public static EnumC31154CKo valueOf(String str) {
        return (EnumC31154CKo) V0N.LJJJ(EnumC31154CKo.class, str);
    }

    public static EnumC31154CKo[] values() {
        return (EnumC31154CKo[]) LJLJI.clone();
    }

    static {
        LinkedList linkedList = new LinkedList();
        EnumC31157CKr enumC31157CKr = EnumC31157CKr.YES;
        EnumC31157CKr enumC31157CKr2 = EnumC31157CKr.WHATEVER;
        EnumC31157CKr enumC31157CKr3 = EnumC31157CKr.NO;
        linkedList.add(new C31152CKm(enumC31157CKr, enumC31157CKr2, enumC31157CKr, enumC31157CKr, enumC31157CKr3));
        linkedList.add(new C31152CKm(enumC31157CKr3, enumC31157CKr2, enumC31157CKr, enumC31157CKr, enumC31157CKr2));
        EnumC31154CKo enumC31154CKo = new EnumC31154CKo("SHOW", 0, "Show the gift icon", linkedList);
        SHOW = enumC31154CKo;
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(new C31152CKm(enumC31157CKr2, enumC31157CKr3, enumC31157CKr3, enumC31157CKr2, enumC31157CKr2));
        EnumC31154CKo enumC31154CKo2 = new EnumC31154CKo("HIDE", 1, "Hide the gift icon", linkedList2);
        HIDE = enumC31154CKo2;
        EnumC31154CKo enumC31154CKo3 = new EnumC31154CKo("GREY", 2, "Show the grey gift icon", null);
        GREY = enumC31154CKo3;
        LJLJI = new EnumC31154CKo[]{enumC31154CKo, enumC31154CKo2, enumC31154CKo3};
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

    public EnumC31154CKo(String str, int i, String str2, List list) {
        this.LJLIL = str2;
        this.LJLILLLLZI = list;
    }
}
