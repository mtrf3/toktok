package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftDBExt$getDraftPrimaryKeys$2", f = "DraftDBExt.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GPC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<String>>, Object> {
    public final /* synthetic */ GP9 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPC(GP9 gp9, InterfaceC67352kd<? super GPC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = gp9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GPC(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC41422GNm enumC41422GNm;
        C141335gf.LIZJ(obj);
        SQLiteDatabase readableDatabase = SQLiteHelper.getInstance().getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        if (GNP.LIZ()) {
            enumC41422GNm = EnumC41422GNm.FIRST_SAVE_TIME;
        } else {
            enumC41422GNm = EnumC41422GNm.LAST_SAVE_TIME;
        }
        Cursor cursor = readableDatabase.rawQuery(GPF.LIZ(new GPG(enumC41422GNm, null, null, true, this.LJLIL, null, 38)), null);
        try {
            o.LJIIIIZZ(cursor, "cursor");
            if (GPD.LIZ(cursor) > 0) {
                while (GPD.LIZIZ(cursor)) {
                    int columnIndex = cursor.getColumnIndex("video_path");
                    if (columnIndex >= 0) {
                        String string = cursor.getString(columnIndex);
                        o.LJIIIIZZ(string, "cursor.getString(primaryKeyColumnIndex)");
                        arrayList.add(string);
                    }
                }
            }
            AnonymousClass636.LJFF(cursor, null);
            return arrayList;
        } finally {
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
