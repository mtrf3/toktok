package X;

import android.database.Cursor;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;

/* loaded from: classes7.dex */
public final class G0J implements InterfaceC63132Oq8 {
    public final Object LIZ;

    @Override // X.InterfaceC63132Oq8
    public final void close() {
        ((Cursor) this.LIZ).close();
    }

    @Override // X.InterfaceC63132Oq8
    public final int getCount() {
        return ((Cursor) this.LIZ).getCount();
    }

    @Override // X.InterfaceC63132Oq8
    public final boolean moveToFirst() {
        return ((Cursor) this.LIZ).moveToFirst();
    }

    @Override // X.InterfaceC63132Oq8
    public final boolean moveToNext() {
        return ((Cursor) this.LIZ).moveToNext();
    }

    public final InterfaceC40768FzI LIZ(int i) {
        InterfaceC40768FzI g0o;
        if (((java.util.Map) this.LIZ).get(Integer.valueOf(i)) == null) {
            if (i == EnumC40761FzB.JOURNEY_SLOGAN_ID.getId()) {
                g0o = new C40764FzE();
            } else if (i == EnumC40761FzB.JOURNEY_INTERESTS_ID.getId()) {
                g0o = new G01();
            } else if (i == EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID.getId()) {
                g0o = new G0U();
            } else if (i == EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID.getId()) {
                g0o = new G0I();
            } else if (i == EnumC40761FzB.JOURNEY_SWIPE_UP_ID.getId()) {
                g0o = new C40801Fzp();
            } else if (i == EnumC40761FzB.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID.getId()) {
                g0o = new C40834G0w();
            } else if (i == EnumC40761FzB.JOURNEY_DEEPLINK_ID.getId()) {
                g0o = new G0Y();
            } else if (i == EnumC40761FzB.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID.getId()) {
                g0o = new G0P();
            } else if (i == EnumC40761FzB.JOURNEY_PRIVACY_HIGHLIGHTS_FOR_TEENS.getId()) {
                g0o = new C40837G0z();
            } else if (i == EnumC40761FzB.JOURNEY_LYNX_EXPERIENCE_ID.getId()) {
                g0o = new G0S();
            } else if (i == EnumC40761FzB.JOURNEY_SERVER_DELAY.getId()) {
                g0o = new C35874E6c();
            } else if (i == EnumC40761FzB.JOURNEY_SMART_LOCK_ID.getId()) {
                g0o = new C40825G0n();
            } else if (i == EnumC40761FzB.JOURNEY_AGE_GATE_ID.getId()) {
                g0o = new C40840G1c();
            } else if (i == EnumC40761FzB.JOURNEY_LOGIN_ID.getId()) {
                g0o = new C40862G1y();
            } else if (i == EnumC40761FzB.JOURNEY_SUBSCRIPTION_ID.getId()) {
                g0o = new G0K();
            } else if (i == EnumC40761FzB.JOURNEY_FREE_TRIAL_ID.getId()) {
                g0o = new G0O();
            }
            ((java.util.Map) this.LIZ).put(Integer.valueOf(i), g0o);
        }
        return (InterfaceC40768FzI) ((java.util.Map) this.LIZ).get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC63132Oq8
    public final byte[] getBlob(int i) {
        return ((Cursor) this.LIZ).getBlob(i);
    }

    @Override // X.InterfaceC63132Oq8
    public final int getColumnIndex(String str) {
        return ((Cursor) this.LIZ).getColumnIndex(str);
    }

    @Override // X.InterfaceC63132Oq8
    public final int getInt(int i) {
        return ((Cursor) this.LIZ).getInt(i);
    }

    @Override // X.InterfaceC63132Oq8
    public final long getLong(int i) {
        return ((Cursor) this.LIZ).getLong(i);
    }

    @Override // X.InterfaceC63132Oq8
    public final String getString(int i) {
        return ((Cursor) this.LIZ).getString(i);
    }

    public /* synthetic */ G0J(KNJsonConverter kNJsonConverter) {
        this.LIZ = kNJsonConverter;
    }
}
