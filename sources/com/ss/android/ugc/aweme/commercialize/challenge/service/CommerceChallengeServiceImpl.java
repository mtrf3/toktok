package com.ss.android.ugc.aweme.commercialize.challenge.service;

import X.C188727au;
import X.C201577vd;
import X.C40084FoG;
import X.C58096Mr6;
import X.C63069Op7;
import X.C63070Op8;
import X.C63071Op9;
import X.C63072OpA;
import X.C63074OpC;
import X.C63076OpE;
import X.C68322mC;
import X.C78765Uvh;
import X.C78983UzD;
import X.C86V;
import X.FMX;
import X.KTC;
import X.KTD;
import X.KTE;
import X.NTG;
import X.NTK;
import X.T55;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.model.Hashtag2Emoji;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceChallengeServiceImpl implements ICommerceChallengeService {
    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final LinkedHashMap<String, Bitmap> LJFF() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_edit_hashtag_with_emoji", true);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (z) {
            return C63069Op7.LIZLLL;
        }
        return new LinkedHashMap<>();
    }

    public static ICommerceChallengeService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceChallengeService.class, false);
        if (LIZ != null) {
            return (ICommerceChallengeService) LIZ;
        }
        if (C58096Mr6.LLLJL == null) {
            synchronized (ICommerceChallengeService.class) {
                if (C58096Mr6.LLLJL == null) {
                    C58096Mr6.LLLJL = new CommerceChallengeServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLJL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final T55 LIZ() {
        return new T55();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJ() {
        C63069Op7.LIZLLL.clear();
        C63069Op7.LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LIZLLL(Challenge challenge) {
        int i;
        int i2 = 0;
        if (challenge != null && C63070Op8.LIZ(challenge)) {
            ReentrantReadWriteLock reentrantReadWriteLock = C63070Op8.LIZ;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C63070Op8.LIZLLL(challenge.getCid());
                C63070Op8.LIZLLL(challenge.getChallengeName());
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJI(int i) {
        long currentTimeMillis;
        long currentTimeMillis2;
        UrlModel urlModel;
        Long l;
        Long l2;
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("enable_edit_hashtag_with_emoji", true)) {
                C63069Op7.LIZLLL.clear();
                return;
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (C63069Op7.LIZJ) {
            return;
        }
        C63069Op7.LIZJ = true;
        C63069Op7.LIZ();
        C63069Op7.LIZLLL.clear();
        for (String str : C63069Op7.LIZ.keySet()) {
            Hashtag2Emoji hashtag2Emoji = C63069Op7.LIZ.get(str);
            if (hashtag2Emoji != null && (l2 = hashtag2Emoji.startTime) != null) {
                currentTimeMillis = l2.longValue();
            } else {
                currentTimeMillis = (System.currentTimeMillis() / 1000) + 1;
            }
            Hashtag2Emoji hashtag2Emoji2 = C63069Op7.LIZ.get(str);
            if (hashtag2Emoji2 != null && (l = hashtag2Emoji2.expireTime) != null) {
                currentTimeMillis2 = l.longValue();
            } else {
                currentTimeMillis2 = (System.currentTimeMillis() / 1000) - 1;
            }
            long j = currentTimeMillis + 1;
            long currentTimeMillis3 = System.currentTimeMillis() / 1000;
            if (j <= currentTimeMillis3 && currentTimeMillis3 < currentTimeMillis2) {
                Hashtag2Emoji hashtag2Emoji3 = C63069Op7.LIZ.get(str);
                if (hashtag2Emoji3 != null) {
                    urlModel = hashtag2Emoji3.urlModel;
                } else {
                    urlModel = null;
                }
                C40084FoG.LIZLLL(urlModel, "hashtagemoji").LJIIIZ(new C63072OpA(str, i));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIL(TextExtraStruct textExtraStruct) {
        if (textExtraStruct != null && textExtraStruct.isCommerce()) {
            C63070Op8.LIZIZ(textExtraStruct.getCid());
            C63070Op8.LIZIZ(textExtraStruct.getHashTagName());
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIILIIL(String str) {
        boolean z = false;
        if (str != null && str.length() != 0) {
            ReentrantReadWriteLock.ReadLock readLock = C63070Op8.LIZ.readLock();
            readLock.lock();
            try {
                z = C63070Op8.LIZIZ.contains(str);
            } finally {
                readLock.unlock();
            }
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIILL(Challenge challenge) {
        if (challenge != null) {
            try {
                NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) new Gson().LJII(challenge.getChallengeStickerDetail(), new C63076OpE().getType());
                if (newFaceStickerBean != null) {
                    return CommerceLockStickerServiceImpl.LIZJ().LIZ(newFaceStickerBean);
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIILLIIL(NTG ntg) {
        NTK.LIZ.LIZIZ(ntg);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIJJ(Challenge challenge) {
        if (challenge != null && C63070Op8.LIZ(challenge)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final Aweme LJIJJLI(Aweme aweme) {
        if (aweme != null && aweme.getTextExtra() != null && !TextUtils.isEmpty(aweme.getDesc())) {
            StringBuffer stringBuffer = new StringBuffer(aweme.getDesc());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            o.LJIIIIZZ(textExtra, "aweme.textExtra");
            arrayList2.addAll(textExtra);
            Collections.sort(arrayList2, new C63074OpC());
            Iterator it = arrayList2.iterator();
            int i = 0;
            while (it.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
                if (i != 0) {
                    textExtraStruct.setStart(textExtraStruct.getStart() + i);
                    textExtraStruct.setEnd(textExtraStruct.getEnd() + i);
                }
                if (textExtraStruct.getType() == 1 && C63069Op7.LIZIZ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null && textExtraStruct.getHashTagName().length() == (textExtraStruct.getEnd() - textExtraStruct.getStart()) - 1 && stringBuffer.length() >= textExtraStruct.getEnd()) {
                    stringBuffer.insert(textExtraStruct.getEnd(), C86V.LJFF(R.string.rhe));
                    textExtraStruct.setEnd(textExtraStruct.getEnd() + 1);
                    i++;
                }
                arrayList.add(textExtraStruct);
            }
            if (i != 0) {
                aweme.setDesc(stringBuffer.toString());
                aweme.setTextExtra(arrayList);
            }
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIL(String str) {
        C63070Op8.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LIZJ(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        String lowerCase = str2.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        c188727au.LJIIIZ("tag_name", lowerCase);
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("click_commercial_emoji", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIIIZZ(String str, String str2) {
        Uri parse;
        if (str == null || (parse = UriProtector.parse(str)) == null) {
            return;
        }
        C63070Op8.LIZJ(parse, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIIZ(Uri uri, String str) {
        C63070Op8.LIZJ(uri, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIJ(String str, String str2) {
        C63069Op7.LIZLLL(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIJJI(TextView textView, Aweme aweme, SpannableString spannableString) {
        UrlModel LIZIZ;
        if (aweme == null) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = spannableString;
        if (aweme.getTextExtra() == null || TextUtils.isEmpty(spannableString)) {
            return;
        }
        for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
            if (textExtraStruct.getType() == 1 && C63069Op7.LIZJ(textExtraStruct, aweme.getDesc()) && (LIZIZ = C63069Op7.LIZIZ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                W5F LJII = W5U.LJII(LIZIZ);
                LJII.LIZIZ("hashtagemoji");
                LJII.LJIIIZ(new KTC(textView, c68322mC, textExtraStruct));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIZILJ(C201577vd descView, Aweme aweme, String str) {
        UrlModel LIZIZ;
        o.LJIIIZ(descView, "descView");
        if (aweme == null || aweme.getTextExtra() == null || TextUtils.isEmpty(aweme.getDesc())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        o.LJIIIIZZ(textExtra, "aweme.textExtra");
        arrayList.addAll(textExtra);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
            if (textExtraStruct.getType() == 1 && C63069Op7.LIZJ(textExtraStruct, aweme.getDesc()) && (LIZIZ = C63069Op7.LIZIZ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                C78765Uvh.LJIILJJIL(LIZIZ, (int) descView.getTextSize(), (int) descView.getTextSize(), new C63071Op9(descView, str, textExtraStruct));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final UrlModel LJIJ(String str, boolean z, boolean z2) {
        return C63069Op7.LIZIZ(str, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIILJJIL(Context context, String str, UrlModel urlModel, SpannableString spannableString, TextView textView, String str2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(textView, "textView");
        if (TextUtils.isEmpty(String.valueOf(spannableString))) {
            return false;
        }
        int textSize = (int) textView.getTextSize();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        textView.setText(spannableStringBuilder);
        C40084FoG.LIZLLL(urlModel, "hashtagemoji").LJIIIZ(new KTE(textSize, spannableStringBuilder, textView, str, str2));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, android.text.SpannableString] */
    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIJI(Context context, String str, boolean z, TextView textView, boolean z2, String str2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(textView, "textView");
        if (!TextUtils.isEmpty(str)) {
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = new SpannableString(str);
            UrlModel LIZIZ = C63069Op7.LIZIZ(str, z, z2);
            if (LIZIZ == null) {
                textView.setText((CharSequence) c68322mC.element);
            } else {
                int textSize = (int) textView.getTextSize();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(C86V.LJFF(R.string.rhe));
                c68322mC.element = new SpannableString(X1D.LIZIZ(LIZ));
                C40084FoG.LIZLLL(LIZIZ, "hashtagemoji").LJIIIZ(new KTD(textSize, c68322mC, textView, str, str2, z2));
                return true;
            }
        }
        return false;
    }
}
