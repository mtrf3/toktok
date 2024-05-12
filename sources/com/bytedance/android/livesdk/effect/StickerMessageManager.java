package com.bytedance.android.livesdk.effect;

import X.AbstractC73672Svk;
import X.BP4;
import X.C05170If;
import X.C09650Zl;
import X.C0NB;
import X.C0RN;
import X.C15380j0;
import X.C15420j4;
import X.C16880lQ;
import X.C1EW;
import X.C1PK;
import X.C28467BFf;
import X.C28718BOw;
import X.C31988Cgy;
import X.C31990Ch0;
import X.C31991Ch1;
import X.C31992Ch2;
import X.C31993Ch3;
import X.C31996Ch6;
import X.C62705OjF;
import X.C7N;
import X.CKI;
import X.EnumC31997Ch7;
import X.InterfaceC30516ByK;
import X.InterfaceC31994Ch4;
import X.InterfaceC31995Ch5;
import X.InterfaceC32103Cip;
import X.InterfaceC73573Su9;
import X.X1D;
import X.YE1;
import Y.AfS36S0101000_5;
import Y.IDuS317S0100000_5;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.api.StickerGiftApi;
import com.bytedance.android.livesdk.api.model.CheckGiftUserNameResult;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LiveUserPngInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public class StickerMessageManager implements WeakHandler.IHandler, InterfaceC30516ByK {
    public C31992Ch2 mCurrentMessage;
    public final WeakHandler mHandler;
    public boolean mIsPlaying;
    public final InterfaceC31994Ch4 mStickerHandler;
    public String workRoot;
    public final List<C31992Ch2> mStickerMessages = new LinkedList();
    public final InterfaceC32103Cip mStickerAnimationEngine = new C31988Cgy(this);

    private void tryPlayStickerGift() {
        if (this.mIsPlaying || this.mStickerMessages.isEmpty()) {
            return;
        }
        C0NB.LJIIIZ("STICK", "prepare for resource callback");
        this.mCurrentMessage = (C31992Ch2) ListProtector.remove(this.mStickerMessages, 0);
        C31990Ch0 c31990Ch0 = new C31990Ch0(this);
        this.mIsPlaying = true;
        C7N.LJIIIIZZ().getAssets(null, this.mCurrentMessage.LIZLLL);
        if (C7N.LJIIIIZZ().getAssets(null, this.mCurrentMessage.LIZLLL) != null) {
            downLoadStickAssets(this.mCurrentMessage, c31990Ch0);
            return;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(Long.valueOf(this.mCurrentMessage.LIZLLL));
        C7N.LJIIIIZZ().syncAssetList(4, arrayList, new C31991Ch1(this, c31990Ch0));
    }

    public void createStickerGiftPngIfNeeded() {
        String LIZLLL = C05170If.LIZLLL(this.mCurrentMessage.LJII);
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        C1EW.LIZ(((StickerGiftApi) LIZ.LIZIZ(StickerGiftApi.class)).checkUserNameLegality(LIZLLL)).LJJJLIIL(new C31993Ch3(0, LIZLLL, this), new C1PK(1, this));
    }

    public void destroy() {
        this.mHandler.removeCallbacksAndMessages(null);
        C7N.LJIIIIZZ().removeAnimationEngine(EnumC31997Ch7.STICKER_GIFT);
    }

    public boolean hasStickerMessage() {
        return !this.mStickerMessages.isEmpty();
    }

    public void playNextMessage() {
        if (this.mIsPlaying) {
            this.mHandler.removeMessages(140001);
            WeakHandler weakHandler = this.mHandler;
            weakHandler.sendMessage(weakHandler.obtainMessage(140001));
        }
    }

    public void startPlayStickerGift() {
        if (this.mStickerHandler == null || this.mHandler == null || this.mCurrentMessage == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start to play sticker gift for: ");
        C0RN.LJ(LIZ, this.mCurrentMessage.LJIIJJI, LIZ, "STICK");
        this.mStickerHandler.startPlayStickerGift(stickerMessage2Sticker(this.mCurrentMessage), this.mCurrentMessage.LJIIL);
        WeakHandler weakHandler = this.mHandler;
        weakHandler.sendMessageDelayed(weakHandler.obtainMessage(140001), this.mCurrentMessage.LJIIJJI);
    }

    public void start() {
        try {
            C7N.LJIIIIZZ().setGiftAnimationEngine(EnumC31997Ch7.STICKER_GIFT, this.mStickerAnimationEngine);
        } catch (Exception e) {
            C0NB.LJ("StickerMessageManager", e.toString());
        }
    }

    public C31996Ch6 getCurrentMessage() {
        return this.mCurrentMessage;
    }

    public StickerMessageManager(InterfaceC31994Ch4 interfaceC31994Ch4) {
        if (interfaceC31994Ch4 != null) {
            this.mHandler = new WeakHandler(this);
            this.mStickerHandler = interfaceC31994Ch4;
            AbstractC73672Svk.LJIIJ(new IDuS317S0100000_5(this, 4)).LJII(new C62705OjF()).LJJJJZI(new AfS36S0101000_5(1, this, 57));
            return;
        }
        throw new IllegalArgumentException("stickerHandler must not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x014b, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.text.TextPaint, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.graphics.Canvas] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void createAndSetCustomStickerImage(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.effect.StickerMessageManager.createAndSetCustomStickerImage(java.lang.String):void");
    }

    public /* synthetic */ void lambda$createStickerGiftPngIfNeeded$3(Throwable th) {
        if (!this.mIsPlaying) {
            return;
        }
        createAndSetCustomStickerImage(null);
    }

    public /* synthetic */ void lambda$new$0(InterfaceC73573Su9 interfaceC73573Su9) {
        String liveStickerUserPngWorkPath = getLiveStickerUserPngWorkPath(C15380j0.LIZLLL());
        if (liveStickerUserPngWorkPath == null) {
            liveStickerUserPngWorkPath = "";
        }
        interfaceC73573Su9.onNext(liveStickerUserPngWorkPath);
    }

    public /* synthetic */ void lambda$new$1(String str) {
        this.workRoot = str;
    }

    private LiveEffect stickerMessage2Sticker(C31992Ch2 c31992Ch2) {
        LiveEffect liveEffect = new LiveEffect();
        liveEffect.effectId = c31992Ch2.LJIIIIZZ;
        liveEffect.setUnzipPath(c31992Ch2.LJ);
        return liveEffect;
    }

    public void addMessage(C31992Ch2 c31992Ch2) {
        if (c31992Ch2 == null) {
            return;
        }
        if (c31992Ch2.LJFF) {
            ListProtector.add(this.mStickerMessages, 0, c31992Ch2);
        } else {
            this.mStickerMessages.add(c31992Ch2);
        }
        tryPlayStickerGift();
    }

    public String getLiveStickerUserPngWorkPath(Context context) {
        File LIZIZ;
        if (context == null || (LIZIZ = C15420j4.LIZIZ(context)) == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZIZ.getAbsolutePath());
        String str = File.separator;
        YE1.LIZLLL(LIZ, str, "live", str, "sticker");
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        File file = new File(LIZIZ2);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return LIZIZ2;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (140001 == message.what) {
            this.mStickerHandler.finishPlayStickerGift();
            this.mCurrentMessage = null;
            this.mIsPlaying = false;
            tryPlayStickerGift();
        }
    }

    public static C31992Ch2 getStickerEffectMessage(GiftMessage giftMessage, InterfaceC31995Ch5 interfaceC31995Ch5) {
        C31992Ch2 c31992Ch2 = null;
        if (giftMessage != null && giftMessage.getMessageId() != 0 && giftMessage.fromUser != null) {
            Gift gift = giftMessage.mGift;
            if (gift == null) {
                return null;
            }
            if (giftMessage.colorId == null) {
                giftMessage.colorId = -1L;
            }
            long effectIdWithGiftId = C7N.LJIIIIZZ().getEffectIdWithGiftId(gift, giftMessage.colorId.longValue());
            c31992Ch2 = new C31992Ch2();
            c31992Ch2.LJIILJJIL = interfaceC31995Ch5;
            if (gift.duration <= 0) {
                gift.duration = 3000;
            }
            c31992Ch2.LJIIJJI = gift.duration;
            c31992Ch2.LJIIL = true;
            String str = gift.liveUserPngInfo;
            if (str == null) {
                str = "";
            }
            c31992Ch2.LJIILIIL = (LiveUserPngInfo) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, str, LiveUserPngInfo.class);
            c31992Ch2.LIZJ = giftMessage.getMessageId();
            c31992Ch2.LJIIIIZZ = gift.id;
            c31992Ch2.LIZLLL = effectIdWithGiftId;
            c31992Ch2.LJ = "";
            c31992Ch2.LJFF = false;
            c31992Ch2.LJI = giftMessage.toUser;
            c31992Ch2.LJII = giftMessage.fromUser;
        }
        return c31992Ch2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$createStickerGiftPngIfNeeded$2(String str, C28467BFf c28467BFf) {
        if (!this.mIsPlaying) {
            return;
        }
        if (((CheckGiftUserNameResult) c28467BFf.data).userNameIllegal) {
            str = null;
        }
        createAndSetCustomStickerImage(str);
    }

    public void downLoadStickAssets(C31992Ch2 c31992Ch2, CKI cki) {
        C7N.LJIIIIZZ().getAssets(null, this.mCurrentMessage.LIZLLL);
        C7N.LJIIIIZZ().downloadAssets(c31992Ch2.LIZLLL, cki, 4);
        InterfaceC31995Ch5 interfaceC31995Ch5 = c31992Ch2.LJIILJJIL;
        if (interfaceC31995Ch5 != null) {
            interfaceC31995Ch5.LJIIJ();
        }
    }

    @Override // X.InterfaceC30516ByK
    public void onMessageReceived(int i, int i2, int i3, String str) {
        C31992Ch2 c31992Ch2;
        String LJJIFFI;
        InterfaceC31995Ch5 interfaceC31995Ch5;
        if (i == 17 && i2 == 10 && str != null && (c31992Ch2 = this.mCurrentMessage) != null && !TextUtils.isEmpty(c31992Ch2.LJ)) {
            try {
                new o();
                m LJIIZILJ = o.LIZ(str).LJIIZILJ();
                if (!LJIIZILJ.LJJIJLIJ("resource_added")) {
                    return;
                }
                Iterator<j> it = LJIIZILJ.LJJIJIIJI("resource_added").iterator();
                while (it.hasNext()) {
                    j next = it.next();
                    if ((next instanceof m) && (LJJIFFI = ((m) next).LJJIJ("path").LJJIFFI()) != null && LJJIFFI.equals(this.mCurrentMessage.LJ) && (interfaceC31995Ch5 = this.mCurrentMessage.LJIILJJIL) != null) {
                        interfaceC31995Ch5.LJIIIZ();
                        return;
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
