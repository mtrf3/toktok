package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class FZY implements SharedPreferences.Editor {
    public final InterfaceC39175FZb LIZ;
    public final String LIZIZ;
    public final Context LIZJ;
    public final ContentValues LIZLLL = new ContentValues();

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        try {
            C66859QLv c66859QLv = new C66859QLv(this.LIZIZ, "key", "val", "type");
            ContentResolver contentResolver = this.LIZJ.getContentResolver();
            InterfaceC39175FZb interfaceC39175FZb = this.LIZ;
            Context context = this.LIZJ;
            ((FZZ) interfaceC39175FZb).getClass();
            contentResolver.insert(C39174FZa.LJ(context, c66859QLv), this.LIZLLL);
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return false;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        throw new UnsupportedOperationException("not support clear");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.LIZLLL.putNull(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        this.LIZLLL.put(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        this.LIZLLL.put(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        this.LIZLLL.put(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        this.LIZLLL.put(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        this.LIZLLL.put(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, java.util.Set<String> set) {
        throw new UnsupportedOperationException("putStringSet not support");
    }

    public FZY(Context context, String str, FZZ fzz) {
        this.LIZJ = C16880lQ.LLLLL(context);
        this.LIZ = fzz;
        this.LIZIZ = str;
    }
}
