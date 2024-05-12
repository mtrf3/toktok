package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.367, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass367 {
    public static final AnonymousClass367 ChatSession;
    public static final /* synthetic */ AnonymousClass367[] LJLIL;

    public AnonymousClass367() {
        throw null;
    }

    public static AnonymousClass367 valueOf(String str) {
        return (AnonymousClass367) V0N.LJJJ(AnonymousClass367.class, str);
    }

    public static AnonymousClass367[] values() {
        return (AnonymousClass367[]) LJLIL.clone();
    }

    public abstract List<InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h>> getActionList();

    public abstract String getTitle(Activity activity, String str);

    static {
        AnonymousClass367 anonymousClass367 = new AnonymousClass367() { // from class: X.366
            public final List<InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h>> LJLILLLLZI;

            {
                ArrayList arrayList = new ArrayList();
                arrayList.add(AnonymousClass362.LJLIL);
                arrayList.add(AnonymousClass368.LJLIL);
                arrayList.add(AnonymousClass369.LJLIL);
                arrayList.add(C36A.LJLIL);
                arrayList.add(C36B.LJLIL);
                arrayList.add(AnonymousClass364.LJLIL);
                this.LJLILLLLZI = ORZ.LLJI(arrayList);
            }

            @Override // X.AnonymousClass367
            public final List<InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h>> getActionList() {
                return this.LJLILLLLZI;
            }

            @Override // X.AnonymousClass367
            public final String getTitle(Activity activity, String name) {
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(name, "name");
                String string = activity.getString(R.string.em1, name);
                o.LJIIIIZZ(string, "activity.getString(R.str….dm_android_delete, name)");
                return string;
            }
        };
        ChatSession = anonymousClass367;
        LJLIL = new AnonymousClass367[]{anonymousClass367};
    }

    public AnonymousClass367(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
