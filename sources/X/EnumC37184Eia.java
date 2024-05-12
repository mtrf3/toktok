package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eia, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37184Eia {
    public static final EnumC37184Eia INSTANCE;
    public static final /* synthetic */ EnumC37184Eia[] LJLILLLLZI;
    public final LinkedList<Future> LJLIL;
    public final ExecutorService executorService;

    static {
        EnumC37184Eia enumC37184Eia = new EnumC37184Eia();
        INSTANCE = enumC37184Eia;
        LJLILLLLZI = new EnumC37184Eia[]{enumC37184Eia};
    }

    public EnumC37184Eia() {
        new HashMap();
        this.executorService = C37191Eih.LIZ(new C38027EwB(FSY.SERIAL));
        this.LJLIL = new LinkedList<>();
    }

    public static EnumC37184Eia[] values() {
        return (EnumC37184Eia[]) LJLILLLLZI.clone();
    }

    public static EnumC37184Eia valueOf(String str) {
        return (EnumC37184Eia) V0N.LJJJ(EnumC37184Eia.class, str);
    }

    public void async(Runnable runnable) {
        this.LJLIL.add(this.executorService.submit(runnable));
    }

    public View getView(Context context, int i, ViewGroup viewGroup) {
        return CK4.INSTANCE.inflate(context, i, viewGroup);
    }
}
