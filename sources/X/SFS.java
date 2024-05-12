package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustModule;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SFS implements InterfaceC83702Wt8, InterfaceC75414Tik, FP6, RTU {
    public static Runnable LJLIL = null;
    public static boolean LJLILLLLZI = true;
    public static final SFS LJLJI = new SFS();
    public static String LJLJJI = null;
    public static int LJLJJL = -1;
    public static String LJLJJLL;
    public static XTF LJLJL;

    public static final String LJIIL(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "h264" : "bytevc2" : "bytevc1" : "h264";
    }

    public static final boolean LJIJJLI(int i) {
        return 1 == i;
    }

    @Override // X.FP6
    public void onFail() {
    }

    @Override // X.InterfaceC83702Wt8
    public C83734Wte LIZ() {
        return new C83734Wte();
    }

    @Override // X.InterfaceC83702Wt8
    public boolean isAppBackground() {
        return C41877Gc5.LIZ.LIZIZ();
    }

    @Override // X.FP6
    public void onSuccess() {
        C38430F6k.LIZ();
    }

    public static final List LIZJ(List list) {
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return ORZ.LJLL(list);
    }

    public static FaceStickerBean LIZLLL(Effect effect) {
        return LJFF(effect, "");
    }

    public static int LJI(double d) {
        return LJII(d, C60903NvH.LJ);
    }

    public static Bitmap LJIIIZ(SY9 sy9) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        o.LJIIIZ(config, "config");
        return LJIIIIZZ(sy9, sy9.LIZIZ(), sy9.LIZ(), config);
    }

    public static final List LJIIJ(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        for (Object obj : list) {
            if (((String) obj).length() > 0) {
                LJ.add(obj);
            }
        }
        return LJ;
    }

    public static final String LJIIJJI(StreamVoiceConversionModel streamVoiceConversionModel) {
        o.LJIIIZ(streamVoiceConversionModel, "<this>");
        java.util.Map LJIILLIIL = LJIILLIIL(streamVoiceConversionModel);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((LinkedHashMap) LJIILLIIL).entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Map.Entry) it.next()).getKey());
        }
        return LJJ(streamVoiceConversionModel, ORZ.LLJI(linkedHashSet));
    }

    public static final AIF LJIILIIL(AI8 ai8) {
        o.LJIIIZ(ai8, "<this>");
        AI9 accessory = ai8.getAccessory();
        if (accessory instanceof AIF) {
            return (AIF) accessory;
        }
        return null;
    }

    public static final java.util.Map LJIILLIIL(StreamVoiceConversionModel streamVoiceConversionModel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : streamVoiceConversionModel.vcSegmentEffectIdFromMap.entrySet()) {
            if (streamVoiceConversionModel.vcVoiceId != null && o.LJ(entry.getKey(), streamVoiceConversionModel.vcVoiceId)) {
                linkedHashMap.put(entry.getKey(), "vc_page");
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static List LJIIZILJ(String publisherTag) {
        o.LJIIIZ(publisherTag, "publisherTag");
        EnumC42720Gpg scope = EnumC42720Gpg.DEFAULT;
        C41779GaV c41779GaV = new C41779GaV(publisherTag);
        o.LJIIIZ(scope, "scope");
        return C47261Igj.LJJIJIIJI(new C43389H1d(C47261Igj.LJJIJ(scope), c41779GaV), new C43389H1d(C47261Igj.LJJIJ(scope), new H2M()));
    }

    public static final String LJIJ(AI8 ai8) {
        CharSequence LJIIJJI;
        String charSequence;
        AIF LJIILIIL = LJIILIIL(ai8);
        if (LJIILIIL == null || (LJIIJJI = LJIILIIL.LJIIJJI()) == null || (charSequence = LJIIJJI.toString()) == null) {
            return "";
        }
        return charSequence;
    }

    public static final String LJIJI(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(vEVideoFileInfo.width);
        LIZ.append('*');
        LIZ.append(vEVideoFileInfo.height);
        return X1D.LIZIZ(LIZ);
    }

    public static final boolean LJIL(C66318Q1a c66318Q1a) {
        Object obj = c66318Q1a.LJLIL;
        if (!(obj instanceof Boolean) ? !(c66318Q1a.LJLILLLLZI != 0 || obj == null) : !(c66318Q1a.LJLILLLLZI != 0 || !o.LJ(obj, Boolean.TRUE))) {
            return true;
        }
        return false;
    }

    public static final void LJJIIJZLJL(AI8 ai8) {
        ((TextView) ai8.findViewById(R.id.lao)).setHeight((int) C44384HbQ.LJJJLL(48));
        View title_tv = ai8.findViewById(R.id.lao);
        o.LJIIIIZZ(title_tv, "title_tv");
        C26338AVi.LJI(title_tv, null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), false, 21);
        ((TextView) ai8.findViewById(R.id.lao)).setGravity(16);
    }

    public static final void LJJIJIL(AI8 ai8) {
        ai8.setBackgroundResource(R.drawable.bwn);
        ((TextView) ai8.findViewById(R.id.lao)).setHeight((int) C44384HbQ.LJJJLL(48));
        View title_tv = ai8.findViewById(R.id.lao);
        o.LJIIIIZZ(title_tv, "title_tv");
        C26338AVi.LJI(title_tv, null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), false, 21);
        ((TextView) ai8.findViewById(R.id.lao)).setGravity(16);
        int LJJJLL = (int) C44384HbQ.LJJJLL(16);
        int LJJJLL2 = (int) C44384HbQ.LJJJLL(16);
        C26338AVi.LJI(ai8, Integer.valueOf(LJJJLL), Integer.valueOf((int) C44384HbQ.LJJJLL(6)), Integer.valueOf(LJJJLL2), Integer.valueOf((int) C44384HbQ.LJJJLL(6)), false, 16);
        LJJIJIIJIL(ai8, 101, R.attr.eh);
        LJJIJ(ai8, R.raw.icon_plus, R.attr.eh, 16, true);
    }

    public static final void LJJIJL(AI8 ai8) {
        ai8.setBackgroundResource(0);
        ((TextView) ai8.findViewById(R.id.lao)).setHeight((int) C44384HbQ.LJJJLL(46));
        View title_tv = ai8.findViewById(R.id.lao);
        o.LJIIIIZZ(title_tv, "title_tv");
        C26338AVi.LJI(title_tv, null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), false, 21);
        ((TextView) ai8.findViewById(R.id.lao)).setGravity(16);
        int LJJJLL = (int) C44384HbQ.LJJJLL(0);
        int LJJJLL2 = (int) C44384HbQ.LJJJLL(0);
        C26338AVi.LJI(ai8, Integer.valueOf(LJJJLL), Integer.valueOf((int) C44384HbQ.LJJJLL(0)), Integer.valueOf(LJJJLL2), Integer.valueOf((int) C44384HbQ.LJJJLL(0)), false, 16);
        LJJIJIIJIL(ai8, 101, R.attr.gp);
        LJJIJ(ai8, R.raw.icon_plus_small, R.attr.gx, 20, false);
    }

    public static final void LJJIJLIJ(AI8 ai8) {
        ai8.setBackgroundResource(0);
        ((TextView) ai8.findViewById(R.id.lao)).setHeight((int) C44384HbQ.LJJJLL(46));
        View title_tv = ai8.findViewById(R.id.lao);
        o.LJIIIIZZ(title_tv, "title_tv");
        C26338AVi.LJI(title_tv, null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), false, 21);
        ((TextView) ai8.findViewById(R.id.lao)).setGravity(16);
        ((TextView) ai8.findViewById(R.id.lao)).setMaxLines(1);
        int LJJJLL = (int) C44384HbQ.LJJJLL(0);
        int LJJJLL2 = (int) C44384HbQ.LJJJLL(0);
        C26338AVi.LJI(ai8, Integer.valueOf(LJJJLL), Integer.valueOf((int) C44384HbQ.LJJJLL(0)), Integer.valueOf(LJJJLL2), Integer.valueOf((int) C44384HbQ.LJJJLL(0)), false, 16);
        LJJIJIIJIL(ai8, 102, R.attr.go);
        LJJIJ(ai8, R.raw.icon_pen_fill, R.attr.gx, 16, false);
    }

    public static final C26577Abt LJJIZ(UserTrustModule userTrustModule) {
        List<UserTrustItem> list = userTrustModule.userTrustItems;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return new C26577Abt(userTrustModule.userTrustItems);
    }

    @Override // X.InterfaceC75414Tik
    public void onSuccess(Object value) {
        o.LJIIIZ(value, "value");
    }

    public static FaceStickerBean LJFF(Effect effect, String str) {
        List<String> types;
        if (effect == null) {
            return FaceStickerBean.NONE;
        }
        FaceStickerBean faceStickerBean = new FaceStickerBean();
        String effectId = effect.getEffectId();
        o.LJIIIZ(effectId, "effectId");
        if (HXH.LIZ.get(effectId) != null) {
            String effectId2 = effect.getEffectId();
            o.LJIIIZ(effectId2, "effectId");
            HashMap<String, String> hashMap = HXH.LIZIZ;
            if (hashMap.get(effectId2) != null) {
                String effectId3 = effect.getEffectId();
                o.LJIIIZ(effectId3, "effectId");
                faceStickerBean.setForceBindMusicPath(hashMap.get(effectId3));
            }
        }
        faceStickerBean.setForceBind(V3N.LJJII(effect));
        faceStickerBean.setDesignerId(effect.getDesignerId());
        faceStickerBean.setSource(effect.getSource());
        faceStickerBean.setSchema(effect.getSchema());
        faceStickerBean.setResourceID(effect.getResourceId());
        faceStickerBean.setEffectPublishTime(Long.valueOf(effect.getPublishTime()));
        if (TextUtils.isEmpty(effect.getRecId())) {
            faceStickerBean.setRecId(CardStruct.IStatusCode.DEFAULT);
        } else {
            faceStickerBean.setRecId(effect.getRecId());
        }
        faceStickerBean.setBusi(effect.isBusiness());
        faceStickerBean.setUseVoiceRecognizeSticker(ID0.LJJII(effect));
        faceStickerBean.setAdRawData(effect.getAdRawData());
        faceStickerBean.setFaceStickerCommerceBean((FaceStickerCommerceBean) GsonProtectorUtils.fromJson(new Gson(), effect.getExtra(), FaceStickerCommerceBean.class));
        faceStickerBean.setIconUrl(C78963Uyt.LJIL(effect.getIconUrl()));
        faceStickerBean.setFileUrl(C78963Uyt.LJIL(effect.getFileUrl()));
        try {
            faceStickerBean.setStickerId(CastLongProtector.parseLong(effect.getEffectId()));
        } catch (NumberFormatException unused) {
            faceStickerBean.setStickerId(-1L);
        }
        faceStickerBean.setId(effect.getId());
        if (!TextUtils.isEmpty(effect.getSearchType())) {
            faceStickerBean.setPropSource(effect.getSearchType());
        } else if (!TextUtils.isEmpty(str)) {
            faceStickerBean.setPropSource(str);
        } else {
            faceStickerBean.setPropSource(FaceStickerBean.sCurPropSource);
        }
        if (!TextUtils.isEmpty(FaceStickerBean.sSlideCurrentEffectId) && TextUtils.equals(FaceStickerBean.sSlideCurrentEffectId, effect.getEffectId())) {
            faceStickerBean.setTabType("slide_bar");
        }
        faceStickerBean.setMusicIds(effect.getMusic());
        faceStickerBean.setName(effect.getName());
        faceStickerBean.setHint(effect.getHint());
        faceStickerBean.setHintIcon(C78963Uyt.LJIL(effect.getHintIcon()));
        faceStickerBean.setLocalPath(effect.getUnzipPath());
        if (effect.getTypes() == null) {
            types = new ArrayList<>();
        } else {
            types = effect.getTypes();
        }
        faceStickerBean.setTypes(types);
        faceStickerBean.setTags(effect.getTags());
        faceStickerBean.setChildren(effect.getChildren());
        faceStickerBean.setEffectType(effect.getEffectType());
        faceStickerBean.setParentId(effect.getParentId());
        faceStickerBean.setExtra(effect.getExtra());
        faceStickerBean.setSdkExtra(effect.getSdkExtra());
        faceStickerBean.setGradeKey(effect.getGradeKey());
        faceStickerBean.setRequirements(effect.getRequirements());
        return faceStickerBean;
    }

    public static int LJII(double d, Context context) {
        if (context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
            return (int) ((d * context.getResources().getDisplayMetrics().density) + 0.5d);
        }
        return 0;
    }

    public static final String LJIILJJIL(StreamVoiceConversionModel streamVoiceConversionModel, List list) {
        o.LJIIIZ(streamVoiceConversionModel, "<this>");
        java.util.Map LJIILLIIL = LJIILLIIL(streamVoiceConversionModel);
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            z = false;
            while (it.hasNext()) {
                CharSequence charSequence = (CharSequence) ((LinkedHashMap) LJIILLIIL).get(it.next());
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = ((LinkedHashMap) LJIILLIIL).entrySet().iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((Map.Entry) it2.next()).getValue());
        }
        if (z) {
            linkedHashSet.add("video_edit_page");
        }
        return LJJ(streamVoiceConversionModel, ORZ.LLJI(linkedHashSet));
    }

    public static final NLETrackSlot LJIJJ(NLEModel nLEModel, String str) {
        o.LJIIIZ(nLEModel, "<this>");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                if (TextUtils.equals(next.getUUID(), str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static final String LJJ(StreamVoiceConversionModel streamVoiceConversionModel, List list) {
        o.LJIIIZ(streamVoiceConversionModel, "<this>");
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            return "";
        }
        int size = list.size() - 1;
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                stringBuffer.append((String) obj);
                if (i != size) {
                    stringBuffer.append(',');
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static int LJJI(double d, Context context) {
        return (int) ((d / context.getResources().getDisplayMetrics().density) + 0.5d);
    }

    public static final void LJJIIZI(AI8 ai8, String labelStr) {
        o.LJIIIZ(labelStr, "labelStr");
        AIF LJIILIIL = LJIILIIL(ai8);
        if (LJIILIIL == null) {
            return;
        }
        LJIILIIL.LJIILIIL(labelStr);
        TuxTextView tuxTextView = (TuxTextView) ai8.findViewById(R.id.ffc);
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        tuxTextView.getLayoutParams().width = (int) C44384HbQ.LJJJLL(175);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setTuxFont(102);
        tuxTextView.setTextColorRes(R.attr.go);
        C26338AVi.LJI(LJIILIIL.LIZIZ, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), Integer.valueOf((int) C44384HbQ.LJJJLL(14)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(14)), false, 20);
        View title_tv = ai8.findViewById(R.id.lao);
        o.LJIIIIZZ(title_tv, "title_tv");
        C26338AVi.LJI(title_tv, null, Integer.valueOf((int) C44384HbQ.LJJJLL(14)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(14)), false, 21);
    }

    @Override // X.InterfaceC75414Tik
    public void LJ(LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto permitApply error = ");
        LIZ.append(error);
        LIZ.append(", throwable.message=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        JBR.LJIIJ(LIZ, str, LIZ, "MultiRefuseManager");
    }

    @Override // X.RTU
    public Object apply(Object headEffect, Object effects) {
        o.LJIIIZ(headEffect, "headEffect");
        o.LJIIIZ(effects, "effects");
        return new OSZ(effects, headEffect);
    }

    public static final void LIZIZ(C188627ak c188627ak, int i, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (c188627ak != null) {
            if (!z) {
                TuxTextView tvDesc = c188627ak.getTvDesc();
                if (tvDesc != null) {
                    ViewGroup.LayoutParams layoutParams = tvDesc.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.rightMargin = 0;
                    }
                    tvDesc.requestLayout();
                }
            } else {
                TuxTextView tvDesc2 = c188627ak.getTvDesc();
                int LIZIZ = C7MY.LIZIZ(4);
                if (tvDesc2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = tvDesc2.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams.rightMargin = LIZIZ;
                    }
                    tvDesc2.requestLayout();
                }
            }
            c188627ak.LJLJI.LJLJJL = true;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(2));
                c188627ak.setRootBackground(gradientDrawable);
                c188627ak.LIZJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)));
                c188627ak.setTuxTextSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
                C188627ak.LJ(c188627ak, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), AnonymousClass391.LIZJ(2), AnonymousClass391.LIZJ(0), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))));
                TuxTextView tvDesc3 = c188627ak.getTvDesc();
                Context context = c188627ak.getContext();
                o.LJIIIIZZ(context, "context");
                tvDesc3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context));
                c188627ak.getTvDesc().setTuxFont(51);
                return;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(C32151Nz.LJIIZILJ(2));
            Context context2 = c188627ak.getContext();
            o.LJIIIIZZ(context2, "context");
            gradientDrawable2.setColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, context2));
            c188627ak.setRootBackground(gradientDrawable2);
            c188627ak.LIZJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)));
            c188627ak.setTuxTextSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            C188627ak.LJ(c188627ak, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5))), AnonymousClass391.LIZJ(2), AnonymousClass391.LIZJ(5), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))));
            TuxTextView tvDesc4 = c188627ak.getTvDesc();
            Context context3 = c188627ak.getContext();
            o.LJIIIIZZ(context3, "context");
            tvDesc4.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context3));
            c188627ak.getTvDesc().setTuxFont(72);
            Context context4 = c188627ak.getContext();
            o.LJIIIIZZ(context4, "context");
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.cn, context4);
            Context context5 = c188627ak.getContext();
            o.LJIIIIZZ(context5, "context");
            int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.gu, context5);
            C199897sv c199897sv = c188627ak.LJLJI;
            c199897sv.LJLJJLL = LJIIIIZZ;
            c199897sv.LJLJL = LJIIIIZZ2;
        }
    }

    public static void LJJIFFI(boolean z, String str, XTE xte) {
        String str2;
        if (xte != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", xte.LIZ);
            c188727au.LJI("music_id", str);
            if (z) {
                str2 = "favorite_song";
            } else {
                str2 = "cancel_favorite_song";
            }
            FMX.LJIIL(str2, c188727au.LIZ);
        }
    }

    public static void LJJIIJ(XTE xte, String str, int i) {
        if (xte != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", xte.LIZ);
            c188727au.LJIIIZ("music_id", str);
            c188727au.LJIIIZ("category_name", xte.LIZIZ);
            c188727au.LJIIIZ("enter_method", xte.LIZJ);
            c188727au.LIZLLL(i, "order");
            c188727au.LJI("previous_page", LJLJJI);
            FMX.LJIIL("add_music", c188727au.LIZ);
        }
    }

    public static final void LJJIIZ(AI8 ai8, String str, boolean z) {
        int i;
        AIF LJIILIIL = LJIILIIL(ai8);
        if (LJIILIIL == null) {
            return;
        }
        LJIILIIL.LJIILIIL(str);
        TuxTextView tuxTextView = (TuxTextView) ai8.findViewById(R.id.ffc);
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        tuxTextView.getLayoutParams().width = (int) C44384HbQ.LJJJLL(175);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setTuxFont(102);
        if (z) {
            i = R.attr.eh;
        } else {
            i = R.attr.gp;
        }
        tuxTextView.setTextColorRes(i);
        C26338AVi.LJI(LJIILIIL.LIZIZ, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), Integer.valueOf((int) C44384HbQ.LJJJLL(14)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(14)), false, 20);
        View title_tv = ai8.findViewById(R.id.lao);
        o.LJIIIIZZ(title_tv, "title_tv");
        C26338AVi.LJI(title_tv, null, Integer.valueOf((int) C44384HbQ.LJJJLL(14)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(14)), false, 21);
    }

    public static final void LJJIJIIJI(C63120Opw c63120Opw, long j, C109544Rq lastMessage) {
        o.LJIIIZ(lastMessage, "lastMessage");
        long updatedTime = c63120Opw.getUpdatedTime();
        java.util.Map<String, String> localExt = c63120Opw.getLocalExt();
        boolean z = true;
        if (localExt == null || localExt.isEmpty()) {
            c63120Opw.setLocalExt(new LinkedHashMap());
        }
        EnumC96123pw fromValue = EnumC96123pw.fromValue(lastMessage.getConvRankUpdateRule());
        if (fromValue != EnumC96123pw.IgnoreAllRankUpdate && ((fromValue != EnumC96123pw.IgnoreSenderRankUpdate || !lastMessage.isSelf()) && (fromValue != EnumC96123pw.IgnoreReceiverRankUpdate || lastMessage.isSelf()))) {
            z = false;
        }
        if (!z) {
            java.util.Map<String, String> localExt2 = c63120Opw.getLocalExt();
            o.LJIIIIZZ(localExt2, "localExt");
            localExt2.put("s:last_non_ignore_rank_update_message_creation_time", String.valueOf(j));
        } else {
            if (c63120Opw.getLocalExt().containsKey("s:last_non_ignore_rank_update_message_creation_time")) {
                return;
            }
            java.util.Map<String, String> localExt3 = c63120Opw.getLocalExt();
            o.LJIIIIZZ(localExt3, "localExt");
            localExt3.put("s:last_non_ignore_rank_update_message_creation_time", String.valueOf(updatedTime));
        }
    }

    public static final void LJJIJIIJIL(AI8 ai8, int i, int i2) {
        ((TuxTextView) ai8.findViewById(R.id.lao)).setTuxFont(i);
        ((TuxTextView) ai8.findViewById(R.id.lao)).setTextColorRes(i2);
    }

    public static final Bitmap LJIIIIZZ(Drawable drawable, int i, int i2, Bitmap.Config config) {
        o.LJIIIZ(config, "config");
        int max = Math.max(i, 1);
        int max2 = Math.max(i2, 1);
        Bitmap bitmap = Bitmap.createBitmap(max, max2, config);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, max, max2);
        drawable.draw(canvas);
        o.LJIIIIZZ(bitmap, "bitmap");
        return bitmap;
    }

    public static void LJJIII(XTE xte, String str, int i, boolean z) {
        if (xte != null && z) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", xte.LIZ);
            c188727au.LJIIIZ("music_id", str);
            c188727au.LJIIIZ("category_name", xte.LIZIZ);
            c188727au.LJIIIZ("enter_method", xte.LIZJ);
            c188727au.LIZLLL(i, "order");
            FMX.LJIIL("show_music", c188727au.LIZ);
        }
    }

    public static final void LJJIL(C188627ak c188627ak, MatchedFriendStruct matchedFriendStruct, int i, User user) {
        boolean z;
        List<MutualUser> userList;
        if (c188627ak != null) {
            V1B.LJLLLLLL(c188627ak);
            if (matchedFriendStruct == null) {
                return;
            }
            V1B.LJLZ(c188627ak);
            if (user != null) {
                C57362MfG c57362MfG = new C57362MfG();
                c57362MfG.LJJJJIZL(user);
                c57362MfG.LJJIIZI("notification_page");
                c57362MfG.LJJJ(AX5.LIZ);
                c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
                c57362MfG.LJJLI = EnumC57366MfK.RELATION_LABEL;
                c57362MfG.LJJJJI();
                c57362MfG.LJIILIIL();
            }
            MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
            if (mMutualStruct != null && (userList = mMutualStruct.getUserList()) != null && userList.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            LIZIZ(c188627ak, i, z);
            if (z) {
                c188627ak.LIZ(matchedFriendStruct.getMMutualStruct(), 4);
            } else {
                c188627ak.LJLILLLLZI.setVisibility(0);
                c188627ak.LJLILLLLZI.setMaxLines(3);
                c188627ak.LJLJJLL.setVisibility(8);
                c188627ak.LJLJI.setVisibility(8);
            }
            c188627ak.getTvDesc().setText(matchedFriendStruct.getRecommendReason());
        }
    }

    public static void LJJII(String str, String str2, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        if (!TextUtils.isEmpty(str3)) {
            c188727au.LJI("banner_id", str3);
        }
        c188727au.LJIIIZ("category_name", str);
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("enter_from", str4);
        c188727au.LJI("creation_id", LJLJJLL);
        if (!TextUtils.isEmpty(str5)) {
            c188727au.LJI("category_id", str5);
        }
        FMX.LJIIL("enter_song_category", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIJ(AI8 ai8, int i, int i2, int i3, boolean z) {
        float LJJJLL;
        if (i3 < 0 || i3 > 46) {
            return;
        }
        Context context = ai8.getContext();
        o.LJIIIIZZ(context, "context");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, 0 == true ? 1 : 0);
        tuxIconView.setIconRes(i);
        tuxIconView.setTintColorRes(i2);
        tuxIconView.setIconHeight((int) C44384HbQ.LJJJLL(i3));
        tuxIconView.setIconWidth((int) C44384HbQ.LJJJLL(i3));
        if (z) {
            LJJJLL = C44384HbQ.LJJJLL((48 - i3) / 2);
        } else {
            LJJJLL = C44384HbQ.LJJJLL((46 - i3) / 2);
        }
        int i4 = (int) LJJJLL;
        AIF LJIILIIL = LJIILIIL(ai8);
        if (LJIILIIL == null) {
            return;
        }
        LJIILIIL.LJIIL(tuxIconView);
        LJIILIIL.LJIILL(false);
        C26338AVi.LJI(LJIILIIL.LIZIZ, null, Integer.valueOf(i4), null, Integer.valueOf(i4), false, 21);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x013c, code lost:
    
        if (r3 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0142, code lost:
    
        if (r3.isEmpty() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fd, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0145, code lost:
    
        r47 = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_coupon_panel%2Fpages%2Fcoupon%2Ftemplate.js&gravity=bottom&type=popup&hide_nav_bar=1&hide_status_bar=1&web_bg_color=ffffff&show_dim=1&mask_alpha=0.5";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0149, code lost:
    
        if (r3 == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x014b, code lost:
    
        r7 = com.bytedance.ies.abmock.SettingsManager.LIZLLL();
        r4 = X.C2Q7.LIZ;
        r3 = (com.ss.android.ugc.aweme.ecommerce.core.ab.ECSettingConfig) r7.LJIIIIZZ("ecom_settings_config", com.ss.android.ugc.aweme.ecommerce.core.ab.ECSettingConfig.class, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0159, code lost:
    
        if (r3 != null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015b, code lost:
    
        r3 = r4.couponPanelSchema;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015d, code lost:
    
        if (r3 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x015f, code lost:
    
        r5 = r45.freeReturn;
        r3 = r45.marketingConfig;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0163, code lost:
    
        if (r3 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x016d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3.removePriceStr, java.lang.Boolean.TRUE) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0171, code lost:
    
        r50 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0173, code lost:
    
        r0 = r45.baseInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0175, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0177, code lost:
    
        r3 = r0.globalShippingTag;
        r0 = r0.priceInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x017b, code lost:
    
        if (r0 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017d, code lost:
    
        r0 = r0.panelSchema;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01b0, code lost:
    
        return new X.C69687RWp(r15, r17, r14, r13, r23, r12, r11, r26, r16, r3, r29, r1, r3, r32, r6, r3, r3, r10, r37, r38, r39, r40, r48, r42, r43, r9, r51, r49, r47, r52, r5, r50, r2, r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b1, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x016f, code lost:
    
        if (r53 == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b4, code lost:
    
        r50 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e5, code lost:
    
        r47 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01b7, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01b9, code lost:
    
        r3 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount) X.ORZ.LJLLLL(r45.promotionDiscounts);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c1, code lost:
    
        if (r3 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01c3, code lost:
    
        r3 = r3.schema;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c5, code lost:
    
        if (r3 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01cb, code lost:
    
        if (r3.length() != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e9, code lost:
    
        r3 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount) X.ORZ.LJLLLL(r45.promotionDiscounts);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01f1, code lost:
    
        if (r3 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f3, code lost:
    
        r3 = r3.schema;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f5, code lost:
    
        r47 = java.lang.String.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fb, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01cd, code lost:
    
        r7 = com.bytedance.ies.abmock.SettingsManager.LIZLLL();
        r4 = X.C2Q7.LIZ;
        r3 = (com.ss.android.ugc.aweme.ecommerce.core.ab.ECSettingConfig) r7.LJIIIIZZ("ecom_settings_config", com.ss.android.ugc.aweme.ecommerce.core.ab.ECSettingConfig.class, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01db, code lost:
    
        if (r3 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01dd, code lost:
    
        r3 = r4.couponPanelSchema;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01df, code lost:
    
        if (r3 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01e3, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0144, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0200, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x011b, code lost:
    
        if (r53 != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0121, code lost:
    
        if ((r16 instanceof X.C70498Rle) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0123, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0125, code lost:
    
        r3 = r1.status;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0127, code lost:
    
        if (r3 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0208, code lost:
    
        if (r3.intValue() != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0129, code lost:
    
        r39 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x020e, code lost:
    
        r38 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0212, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0215, code lost:
    
        r3 = r45.logistic;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0217, code lost:
    
        if (r3 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0219, code lost:
    
        r3 = r3.freeShipping;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x021b, code lost:
    
        if (r3 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x021f, code lost:
    
        r29 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0223, code lost:
    
        r26 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00d1, code lost:
    
        if (r4 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        if (r11 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d3, code lost:
    
        r3 = r4.priceInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d5, code lost:
    
        if (r3 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d7, code lost:
    
        r3 = r3.needIcon;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d9, code lost:
    
        if (r3 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00db, code lost:
    
        r26 = r3.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00df, code lost:
    
        r3 = r45.review;
        r3 = r45.baseInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e5, code lost:
    
        if (r3 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e7, code lost:
    
        r3 = r3.showFreeShippingTag;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e9, code lost:
    
        if (r3 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00eb, code lost:
    
        r29 = r3.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ef, code lost:
    
        r3 = r45.activityInfo;
        r3 = r45.productLogos;
        r3 = r45.promotionView;
        r3 = r45.baseInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fd, code lost:
    
        if (r3 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ff, code lost:
    
        r10 = r3.purchaseNotice;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0101, code lost:
    
        r37 = java.lang.Boolean.valueOf(r47);
        r3 = r45.template;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0107, code lost:
    
        if (r3 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0109, code lost:
    
        r38 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010d, code lost:
    
        r3 = r45.marketingConfig;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010f, code lost:
    
        if (r3 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0119, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3.removePriceStr, java.lang.Boolean.TRUE) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020a, code lost:
    
        r39 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x012b, code lost:
    
        r40 = X.C78609UtB.LJJJJJL(r45);
        r43 = X.C70657RoD.LJI(r45, false);
        r3 = r45.baseInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0136, code lost:
    
        if (r3 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0138, code lost:
    
        r9 = r3.voucherReminder;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013a, code lost:
    
        r3 = r45.promotionDiscounts;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo>] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C69687RWp LJJJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r45, boolean r46, boolean r47, boolean r48, boolean r49, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo r50, java.lang.Boolean r51, boolean r52, boolean r53, java.lang.String[] r54) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SFS.LJJJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, boolean, boolean, boolean, boolean, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo, java.lang.Boolean, boolean, boolean, java.lang.String[]):X.RWp");
    }

    public static /* synthetic */ C69687RWp LJJJI(ProductPackStruct productPackStruct, boolean z, boolean z2, boolean z3, boolean z4, PreOrderInfo preOrderInfo, Boolean bool, boolean z5, String[] strArr, int i) {
        String[] strArr2 = strArr;
        boolean z6 = z5;
        if ((i & 64) != 0) {
            z6 = false;
        }
        if ((i & 256) != 0) {
            strArr2 = null;
        }
        return LJJJ(productPackStruct, z, z2, z3, z4, preOrderInfo, bool, z6, false, strArr2);
    }
}
