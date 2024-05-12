package com.ss.android.ugc.aweme.translation.service;

import X.C19N;
import X.C26296ATs;
import X.C58096Mr6;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.keva.Keva;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TranslationLangKevaServiceImpl implements ITranslationLangKevaService {
    public static ITranslationLangKevaService LJIIZILJ() {
        Object LIZ = C58096Mr6.LIZ(ITranslationLangKevaService.class, false);
        if (LIZ != null) {
            return (ITranslationLangKevaService) LIZ;
        }
        if (C58096Mr6.K7 == null) {
            synchronized (ITranslationLangKevaService.class) {
                if (C58096Mr6.K7 == null) {
                    C58096Mr6.K7 = new TranslationLangKevaServiceImpl();
                }
            }
        }
        return C58096Mr6.K7;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LIZ() {
        Keva keva = C26296ATs.LIZIZ;
        keva.erase("key_selected_content_language_codes");
        keva.erase("key_selected_content_language_names");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final String[] LIZIZ() {
        return C26296ATs.LIZIZ.getStringArray("key_selected_do_not_translate_language_names", null);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final String[] LJ() {
        return C26296ATs.LIZIZ.getStringArray("key_selected_content_language_codes", null);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJFF() {
        Keva keva = C26296ATs.LIZIZ;
        keva.erase("key_preferred_language_popup_last_shown_time_in_millis");
        keva.erase("key_preferred_language_popup_count");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final int LJII() {
        return C26296ATs.LIZIZ.getInt("key_preferred_language_popup_count", 0);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final String[] LJIIIIZZ() {
        return C26296ATs.LIZIZ.getStringArray("key_selected_do_not_translate_language_codes", null);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final long LJIIIZ() {
        return C26296ATs.LIZIZ.getLong("key_preferred_language_popup_last_shown_time_in_millis", 0L);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final String[] LJIIJJI() {
        return C26296ATs.LIZIZ.getStringArray("key_selected_content_language_names", null);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJIILIIL() {
        C19N.LIZJ(C26296ATs.LIZIZ, "key_preferred_language_popup_count", 0, 1, "key_preferred_language_popup_count");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJIILLIIL() {
        C26296ATs.LIZIZ.storeLong("key_preferred_language_popup_last_shown_time_in_millis", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LIZJ(InterfaceC88472Yns<? super String[], C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        Set<InterfaceC88472Yns<String[], C76800UCe>> doNotTranCodesChangeListeners = C26296ATs.LIZ;
        o.LJIIIIZZ(doNotTranCodesChangeListeners, "doNotTranCodesChangeListeners");
        synchronized (doNotTranCodesChangeListeners) {
            doNotTranCodesChangeListeners.add(listener);
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LIZLLL(String[] strArr) {
        C26296ATs.LIZIZ.storeStringArray("key_selected_do_not_translate_language_codes", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJI(InterfaceC88472Yns<? super String[], C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        Set<InterfaceC88472Yns<String[], C76800UCe>> doNotTranCodesChangeListeners = C26296ATs.LIZ;
        o.LJIIIIZZ(doNotTranCodesChangeListeners, "doNotTranCodesChangeListeners");
        synchronized (doNotTranCodesChangeListeners) {
            doNotTranCodesChangeListeners.remove(listener);
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJIIJ(String[] strArr) {
        C26296ATs.LIZIZ.storeStringArray("key_selected_content_language_codes", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJIIL(String[] strArr) {
        C26296ATs.LIZIZ.storeStringArray("key_selected_do_not_translate_language_names", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJIILJJIL(String[] strArr) {
        C26296ATs.LIZIZ.storeStringArray("key_selected_content_language_names", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJIILL(long j) {
        C26296ATs.LIZIZ.storeLong("key_preferred_language_popup_last_shown_time_in_millis", j);
    }
}
