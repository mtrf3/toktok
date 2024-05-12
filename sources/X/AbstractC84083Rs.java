package X;

import Y.AfS17S1100000_1;
import Y.AfS53S0100000_1;
import Y.IDComparatorS334S0100000_1;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3Rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84083Rs extends AbstractC82553Lv {
    public String LJLLI;
    public InterfaceC84103Ru LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final boolean LJLLL;

    public AbstractC84083Rs(C3R9 c3r9) {
        super(c3r9);
        this.LJLLJ = C221108m2.LIZIZ(C84093Rt.LJLIL);
        this.LJLLL = c3r9.LJIIIIZZ;
    }

    public final void LJIIIIZZ(String str) {
        if (str == null || str.length() == 0) {
            InterfaceC84103Ru interfaceC84103Ru = this.LJLLILLLL;
            if (interfaceC84103Ru != null) {
                interfaceC84103Ru.zs0("", new ArrayList());
                return;
            }
            return;
        }
        String charSequence = s.LJZI(str).toString();
        this.LJLLI = charSequence;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        final List LLJILJILJ = ORZ.LLJILJILJ(LIZIZ());
        final String str2 = this.LJLLI;
        o.LJI(str2);
        this.LJLLI = null;
        ((C73318Sq2) this.LJLLJ.getValue()).LIZLLL();
        C78999UzT.LJFF(AbstractC73638SvC.LJJIIZ(AbstractC73638SvC.LJI(new InterfaceC66992k3() { // from class: X.3Ej
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [X.OQg] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r8v1, types: [X.SuE] */
            @Override // X.InterfaceC66992k3
            public final void subscribe(InterfaceC65052gv<List<IMConversation>> interfaceC65052gv) {
                ?? r5;
                if (AbstractC84083Rs.this.LJLLL) {
                    List<IMContact> list = LLJILJILJ;
                    ArrayList arrayList = new ArrayList();
                    for (IMContact iMContact : list) {
                        if (iMContact instanceof IMConversation) {
                            arrayList.add(iMContact);
                        }
                    }
                    String str3 = str2;
                    r5 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String displayName = ((IMContact) next).getDisplayName();
                        o.LJIIIIZZ(displayName, "it.displayName");
                        String lowerCase = displayName.toLowerCase();
                        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                        String lowerCase2 = str3.toLowerCase();
                        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
                        if (s.LJJJLZIJ(lowerCase, lowerCase2, false)) {
                            r5.add(next);
                        }
                    }
                } else {
                    r5 = C61878OQg.INSTANCE;
                }
                ((C73578SuE) interfaceC65052gv).onSuccess(r5);
            }
        }).LJJIIJ(T16.LIZ()), AbstractC73638SvC.LJI(new InterfaceC66992k3() { // from class: X.3Cm
            @Override // X.InterfaceC66992k3
            public final void subscribe(InterfaceC65052gv<List<IMUser>> interfaceC65052gv) {
                ArrayList arrayList = new ArrayList();
                C80533Eb c80533Eb = C80533Eb.LIZ;
                List<IMContact> list = LLJILJILJ;
                ArrayList arrayList2 = new ArrayList();
                for (IMContact iMContact : list) {
                    if (iMContact instanceof IMUser) {
                        arrayList2.add(iMContact);
                    }
                }
                String str3 = str2;
                c80533Eb.getClass();
                arrayList.addAll(ORZ.LJLJJL(C80533Eb.LJIILL(str3, arrayList2, true)));
                IMUser fromUser = IMUser.fromUser(((RBX) HG3.LJIILL()).getCurUser());
                if (fromUser != null) {
                    String str4 = str2;
                    String displayName = fromUser.getDisplayName();
                    o.LJIIIIZZ(displayName, "it.displayName");
                    Locale locale = Locale.ROOT;
                    String lowerCase = displayName.toLowerCase(locale);
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = str4.toLowerCase(locale);
                    o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (s.LJJJLZIJ(lowerCase, lowerCase2, false)) {
                        arrayList.add(fromUser);
                        if (arrayList.size() > 1) {
                            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS334S0100000_1(fromUser, 6));
                        }
                    }
                }
                ((C73578SuE) interfaceC65052gv).onSuccess(arrayList);
            }
        }).LJJIIJ(T16.LIZ()), C78846Ux0.LJLIL).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS17S1100000_1(this, str2, 1), new AfS53S0100000_1(this, 60)), (C73318Sq2) this.LJLLJ.getValue());
    }
}
