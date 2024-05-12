package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.IManagementTitleAbility;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.6zS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178466zS {
    public static final C175536uj LIZJ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(fragment, null), C175536uj.class, "source_default_key");
        if (LIZLLL == null) {
            return null;
        }
        return (C175536uj) LIZLLL.getSource();
    }

    public static final IManagementTitleAbility LIZ(Fragment fragment, InterfaceC175696uz keyImpl) {
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(keyImpl, "keyImpl");
        return (IManagementTitleAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IManagementTitleAbility.class, keyImpl.ic());
    }

    public static final CommentManagementAssemVM LIZIZ(Fragment fragment, InterfaceC175696uz keyImpl) {
        C214298b3 c214298b3;
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(keyImpl, "keyImpl");
        C9BD c9bd = C9BD.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(keyImpl, 6);
        C65776Prg LIZ = C65352Pkq.LIZ(CommentManagementAssemVM.class);
        C175736v3 c175736v3 = C175736v3.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, true), C78926UyI.LJJIIJZLJL(fragment, true), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, true), C78926UyI.LJIILLIIL(fragment, true), c175736v3, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C78926UyI.LJJIIJZLJL(fragment, false), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, false), C78926UyI.LJIILLIIL(fragment, false), c175736v3, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return (CommentManagementAssemVM) c214298b3.getValue();
    }
}
