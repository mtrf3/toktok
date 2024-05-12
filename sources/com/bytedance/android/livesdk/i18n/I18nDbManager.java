package com.bytedance.android.livesdk.i18n;

import X.AbstractC73745Swv;
import X.C0BV;
import X.C0NB;
import X.C16880lQ;
import X.C1PK;
import X.C1PN;
import X.C73969T1h;
import X.C78598Ut0;
import X.C78701Uuf;
import X.C86881Y7x;
import X.CallableC78699Uud;
import X.InterfaceC86882Y7y;
import X.InterfaceC92693kP;
import X.T16;
import X.X1D;
import X.Y81;
import X.Y82;
import X.Y83;
import X.Y84;
import X.Y85;
import Y.AfS36S0101000_5;
import Y.AfS38S0101000_10;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.i18n.db.I18nDatabase;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public class I18nDbManager {
    public static volatile Y82 informationDao;
    public static volatile boolean isPrepared;
    public static volatile InterfaceC86882Y7y translationDao;
    public Map<String, String> cachedTranslationMap;
    public long cachedVersion;
    public Y85 dbCallback;
    public boolean isQuerying;
    public boolean isUpdating;
    public String locale;
    public InterfaceC92693kP queryDisposable;
    public InterfaceC92693kP updateDisposable;

    public /* synthetic */ C78701Uuf lambda$queryTranslations$0() {
        Y84 y84 = informationDao.get("locale");
        if (y84 != null) {
            if (TextUtils.equals(this.locale, y84.LIZIZ)) {
                C78701Uuf c78701Uuf = new C78701Uuf();
                Y84 y842 = informationDao.get("version");
                if (y842 != null) {
                    c78701Uuf.LIZ = CastLongProtector.valueOf(y842.LIZIZ).longValue();
                    List<Y83> all = translationDao.getAll();
                    if (all != null && !all.isEmpty()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("");
                        LIZ.append(all.size());
                        LIZ.append(" translations found in db, locale is ");
                        LIZ.append(this.locale);
                        LIZ.append(", version is ");
                        LIZ.append(c78701Uuf.LIZ);
                        C0NB.LIZIZ("i18n_translation", X1D.LIZIZ(LIZ));
                        HashMap hashMap = new HashMap();
                        for (Y83 y83 : all) {
                            if (!TextUtils.isEmpty(y83.LIZ) && !TextUtils.isEmpty(y83.LIZIZ)) {
                                hashMap.put(y83.LIZ, y83.LIZIZ);
                            }
                        }
                        c78701Uuf.LIZIZ = hashMap;
                        return c78701Uuf;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("translations not found for locale: ");
                    LIZ2.append(this.locale);
                    throw new Exception(X1D.LIZIZ(LIZ2));
                }
                throw new Exception("version info not found in db");
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("locale in db is ");
            LIZ3.append(y84.LIZIZ);
            LIZ3.append(", but you are request for ");
            LIZ3.append(this.locale);
            throw new Exception(X1D.LIZIZ(LIZ3));
        }
        throw new Exception("locale info not found in db");
    }

    private void updateCachedContentIfNeed() {
        long j = this.cachedVersion;
        if (j >= 0) {
            updateTranslations(j, this.cachedTranslationMap);
            this.cachedVersion = -1L;
            this.cachedTranslationMap = null;
        }
    }

    public void destroy() {
        C0NB.LIZIZ("i18n_translation", "I18nDbManager destroy");
        InterfaceC92693kP interfaceC92693kP = this.queryDisposable;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            this.queryDisposable.dispose();
        }
        InterfaceC92693kP interfaceC92693kP2 = this.updateDisposable;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed()) {
            this.updateDisposable.dispose();
        }
        this.dbCallback = null;
    }

    public void queryTranslations() {
        C0NB.LIZIZ("i18n_translation", "query translations");
        if (this.isQuerying) {
            C0NB.LIZIZ("i18n_translation", "is querying, return");
        } else {
            this.isQuerying = true;
            this.queryDisposable = AbstractC73745Swv.LIZLLL(new CallableC78699Uud(0, this)).LJIILJJIL(T16.LIZ()).LJIIJ(new C1PK(3, this), new AfS36S0101000_5(1, this, 9));
        }
    }

    public void lambda$queryTranslations$1(C78701Uuf c78701Uuf) {
        this.isQuerying = false;
        Y85 y85 = this.dbCallback;
        if (y85 != null) {
            String str = this.locale;
            Y81 y81 = (Y81) y85;
            y81.getClass();
            if (TextUtils.isEmpty(str) || !TextUtils.equals(y81.LIZ.LIZ, str)) {
                if (TextUtils.isEmpty(str)) {
                    C0NB.LJ("i18n_translation", "on db query result, but locale from db is empty");
                } else {
                    C0NB.LIZIZ("i18n_translation", "on db query result, but locale is not matched");
                }
                C86881Y7x c86881Y7x = y81.LIZ;
                I18nUpdateManager i18nUpdateManager = c86881Y7x.LIZLLL;
                if (i18nUpdateManager != null) {
                    i18nUpdateManager.LIZIZ(c86881Y7x.LIZIZ);
                    return;
                }
                return;
            }
            if (c78701Uuf.LIZ == y81.LIZ.LIZIZ) {
                C0NB.LIZIZ("i18n_translation", "version in db is lower than or equals with version in memory");
                return;
            }
            Map<String, String> map = c78701Uuf.LIZIZ;
            if (map == null || ((HashMap) map).isEmpty()) {
                C86881Y7x c86881Y7x2 = y81.LIZ;
                I18nUpdateManager i18nUpdateManager2 = c86881Y7x2.LIZLLL;
                if (i18nUpdateManager2 != null) {
                    i18nUpdateManager2.LIZIZ(c86881Y7x2.LIZIZ);
                }
                C0NB.LIZIZ("i18n_translation", "translations from db is empty, update from server");
                return;
            }
            C86881Y7x c86881Y7x3 = y81.LIZ;
            c86881Y7x3.LIZIZ = c78701Uuf.LIZ;
            c86881Y7x3.LIZJ = c78701Uuf.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on db query result, update translationMap in memory, version is ");
            LIZ.append(y81.LIZ.LIZIZ);
            C0NB.LIZIZ("i18n_translation", X1D.LIZIZ(LIZ));
            C86881Y7x c86881Y7x4 = y81.LIZ;
            I18nUpdateManager i18nUpdateManager3 = c86881Y7x4.LIZLLL;
            if (i18nUpdateManager3 == null) {
                return;
            }
            i18nUpdateManager3.LIZIZ(c86881Y7x4.LIZIZ);
        }
    }

    public void lambda$queryTranslations$2(Throwable th) {
        this.isQuerying = false;
        Y85 y85 = this.dbCallback;
        if (y85 != null) {
            String str = this.locale;
            Exception exc = new Exception(th);
            Y81 y81 = (Y81) y85;
            y81.getClass();
            C0NB.LJ("i18n_translation", exc.toString());
            if (TextUtils.isEmpty(str) || !TextUtils.equals(y81.LIZ.LIZ, str)) {
                if (TextUtils.isEmpty(str)) {
                    C0NB.LJ("i18n_translation", "on db query result, but locale from db is empty");
                } else {
                    C0NB.LIZIZ("i18n_translation", "on db query result, but locale is not matched");
                }
            }
            C86881Y7x c86881Y7x = y81.LIZ;
            I18nUpdateManager i18nUpdateManager = c86881Y7x.LIZLLL;
            if (i18nUpdateManager != null) {
                i18nUpdateManager.LIZIZ(c86881Y7x.LIZIZ);
            }
        }
    }

    public /* synthetic */ void lambda$updateTranslations$4(Boolean bool) {
        this.isUpdating = false;
        Y85 y85 = this.dbCallback;
        if (y85 != null) {
            y85.getClass();
        }
        updateCachedContentIfNeed();
    }

    public void lambda$updateTranslations$5(Throwable th) {
        this.isUpdating = false;
        Y85 y85 = this.dbCallback;
        if (y85 != null) {
            Exception exc = new Exception(th);
            y85.getClass();
            C0NB.LJ("i18n_translation", exc.toString());
        }
        updateCachedContentIfNeed();
    }

    public static void prepareInit(Context context) {
        if (!isPrepared) {
            synchronized (I18nDbManager.class) {
                if (!isPrepared) {
                    if (context == null) {
                        return;
                    }
                    I18nDatabase i18nDatabase = (I18nDatabase) C0BV.LIZ(C16880lQ.LLLLL(context), I18nDatabase.class, "i18n_live").LIZIZ();
                    translationDao = i18nDatabase.LJIJI();
                    informationDao = i18nDatabase.LJIJ();
                    isPrepared = true;
                }
            }
        }
    }

    public I18nDbManager(String str, Y85 y85) {
        this.locale = str;
        this.dbCallback = y85;
        prepareInit(C16880lQ.LLLLL(C78598Ut0.LJIIJ()));
    }

    public /* synthetic */ Boolean lambda$updateTranslations$3(Map map, long j) {
        Set<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                arrayList.add(new Y83((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        translationDao.empty();
        translationDao.LIZ(arrayList);
        informationDao.LIZ(new Y84("locale", this.locale));
        informationDao.LIZ(new Y84("version", String.valueOf(j)));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(arrayList.size());
        LIZ.append(" translations saved in db, locale is ");
        b0.LJ(LIZ, this.locale, ", version is ", j);
        C0NB.LIZIZ("i18n_translation", X1D.LIZIZ(LIZ));
        return Boolean.TRUE;
    }

    public void updateTranslations(final long j, final Map<String, String> map) {
        C0NB.LIZIZ("i18n_translation", "update translations in db");
        if (TextUtils.isEmpty(this.locale) || map == null || map.isEmpty()) {
            if (TextUtils.isEmpty(this.locale)) {
                C0NB.LJ("i18n_translation", "locale is empty, return");
                return;
            } else {
                C0NB.LJ("i18n_translation", "translation map is empty, return");
                return;
            }
        }
        if (this.isUpdating) {
            this.cachedVersion = j;
            this.cachedTranslationMap = map;
            C0NB.LIZIZ("i18n_translation", "is updating, saved as cache and return");
        } else {
            this.isUpdating = true;
            this.updateDisposable = AbstractC73745Swv.LIZLLL(new Callable() { // from class: X.Y7z
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean lambda$updateTranslations$3;
                    lambda$updateTranslations$3 = I18nDbManager.this.lambda$updateTranslations$3(map, j);
                    return lambda$updateTranslations$3;
                }
            }).LJII(C73969T1h.LIZIZ()).LJIILJJIL(T16.LIZ()).LJIIJ(new AfS38S0101000_10(1, this, 1), new C1PN(2, this));
        }
    }
}
