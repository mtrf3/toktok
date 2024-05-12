package X;

import Y.ARunnableS14S0201000_11;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.question.ForumStruct;
import defpackage.e1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class V1B implements InterfaceC75158Tec, IPoiAnchorService, InterfaceC173286r6, InterfaceC006400u {
    public static String LJLIL;
    public static String LJLILLLLZI;
    public static String LJLJI;
    public static String LJLJJI;

    public /* synthetic */ V1B(long j) {
    }

    @Override // X.InterfaceC75158Tec
    public void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    public void LJLIIIL(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public boolean shouldShowCustomFeedSingleAnchor(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public boolean shouldShowOldFeedSingleAnchor(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return false;
    }

    public /* synthetic */ V1B() {
    }

    public static final void LJIIZILJ(String content) {
        o.LJIIIZ(content, "content");
        C34B.LIZIZ("TakoManager", content);
    }

    public static CommentStruct LJJI(Aweme aweme) {
        LinkData LIZ = C63077OpF.LIZ(aweme);
        if (LIZ != null) {
            if (LIZ.linkType == 0) {
                if (!e1.LIZ(31744, "enable_link_ad_migration", true, true)) {
                    return null;
                }
                CommentStruct commentStruct = new CommentStruct();
                commentStruct.setAid(aweme.getAid());
                commentStruct.setAvatarIcon(LIZ.avatarIcon);
                commentStruct.setButtonText(LIZ.buttonText);
                commentStruct.setCommentTime(aweme.getCreateTime());
                commentStruct.setCommentInfo(LIZ.title);
                commentStruct.setTitle(LIZ.title);
                commentStruct.setCommentNickName(aweme.getAuthor().getNickname());
                commentStruct.setUser(aweme.getAuthor());
                commentStruct.setCommentType(10);
                return commentStruct;
            }
            if (LIZ.linkType != 1 || !C63081OpJ.LJJLL(aweme)) {
                return null;
            }
            CommentStruct commentStruct2 = new CommentStruct();
            commentStruct2.setCommentTime(aweme.getCreateTime());
            commentStruct2.setCommentType(12);
            return commentStruct2;
        }
        return null;
    }

    public static final int LJJIIJZLJL(float f) {
        double floor;
        if (f >= 0.0f) {
            floor = Math.ceil(f);
        } else {
            floor = Math.floor(f);
        }
        return -((int) floor);
    }

    public static UCH LJJJJJL(int i) {
        if (i != 0) {
            if (i != 1) {
                return new V1D();
            }
            return new V1C();
        }
        return new V1D();
    }

    public static void LJJL(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                LJJLIIIJJIZ(file2);
            }
        }
    }

    public static boolean LJJLIIIJJIZ(File file) {
        if (file.isDirectory()) {
            LJJL(file);
        }
        return C16880lQ.LLLZZIL(file);
    }

    public static final List LJJLIIIJL(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OrderShopDigest orderShopDigest = (OrderShopDigest) it.next();
                List<OrderSKUDTO> orderSKUs = orderShopDigest.getOrderSKUs();
                if (orderSKUs != null) {
                    for (OrderSKUDTO orderSKUDTO : orderSKUs) {
                        arrayList.add(new AddressPromotionSku(orderSKUDTO.productId, orderSKUDTO.skuId, orderShopDigest.getSellerId(), orderSKUDTO.sourceInfo));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final String LJJLIIIJLLLLLLLZ(SoundEffect soundEffect) {
        o.LJIIIZ(soundEffect, "<this>");
        return String.valueOf(soundEffect.id);
    }

    public static final String LJJLL(Request request) {
        String str;
        o.LJIIIZ(request, "request");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            request.getBody().writeTo(byteArrayOutputStream);
            str = byteArrayOutputStream.toString();
        } catch (Exception unused) {
            str = "";
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
        byteArrayOutputStream.close();
        o.LJIIIIZZ(str, "try {\n        request.bo…utputStream.close()\n    }");
        String decode = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        o.LJIIIIZZ(decode, "decode(content, StandardCharsets.UTF_8.name())");
        return decode;
    }

    public static String LJJZ(Context context) {
        if (LJLIL == null) {
            String replace = OHZ.LJFF().replace(context.getPackageName(), "p").replace(":", "_");
            LJLIL = replace;
            LJLIL = replace.replace(".", "_");
        }
        return LJLIL;
    }

    public static boolean LJJZZIII(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final boolean LJL(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJLI(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj instanceof ActivityC86117Xqz) {
            return !activityC45651qj.isDestroyed();
        }
        return false;
    }

    public static void LJLIL(java.util.Map map) {
        String str;
        String str2;
        if (map == null) {
            return;
        }
        C53948LFg LIZIZ = C53946LFe.LIZIZ();
        if (LIZIZ.LJFF) {
            str = "3";
        } else {
            str = "1";
        }
        HashMap hashMap = (HashMap) map;
        hashMap.put("pad_interface_orientation", str);
        if (LIZIZ.LJI) {
            if (LIZIZ.LJII) {
                str2 = "pic_in_pic";
            } else {
                str2 = "multi_mode";
            }
            hashMap.put("screen_multi_mode", str2);
            hashMap.put("screen_on_multi_win_width_dp", String.valueOf(LIZIZ.LIZIZ()));
            hashMap.put("screen_on_multi_win_height_dp", String.valueOf(LIZIZ.LIZ()));
        }
    }

    public static final void LJLILLLLZI(Dialog dialog) {
        o.LJIIIZ(dialog, "<this>");
        if (dialog.isShowing()) {
            Context context = dialog.getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            try {
                if (LJIJJ != null) {
                    boolean isDestroyed = LJIJJ.isDestroyed();
                    if (!LJIJJ.isFinishing() && !isDestroyed) {
                        dialog.dismiss();
                    }
                } else {
                    dialog.dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final void LJLJI(DialogC61824OOe dialogC61824OOe) {
        o.LJIIIZ(dialogC61824OOe, "<this>");
        if (dialogC61824OOe.isShowing()) {
            Context context = dialogC61824OOe.getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            try {
                if (LJIJJ != null) {
                    boolean isDestroyed = LJIJJ.isDestroyed();
                    if (!LJIJJ.isFinishing() && !isDestroyed) {
                        dialogC61824OOe.hide();
                    }
                } else {
                    dialogC61824OOe.hide();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final void LJLJJL(Dialog dialog) {
        o.LJIIIZ(dialog, "<this>");
        Context context = dialog.getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if ((LJIJJ != null && LJIJJ.isFinishing()) || dialog.isShowing()) {
            return;
        }
        try {
            C16880lQ.LIZ(dialog);
        } catch (Exception unused) {
        }
    }

    public static void LJLLILLLL(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C80418VhG) {
            LJLLJ(view, (C80418VhG) background);
        }
    }

    public static final void LJLLLLLL(View view) {
        o.LJIIIZ(view, "<this>");
        KL2.LJIILLIIL(8, view);
    }

    public static final void LJLZ(View view) {
        o.LJIIIZ(view, "<this>");
        KL2.LJIILLIIL(0, view);
    }

    public static final Activity LJZ(Context tryGetActivity) {
        o.LJIIJ(tryGetActivity, "$this$tryGetActivity");
        while (tryGetActivity != null) {
            if (tryGetActivity instanceof Activity) {
                return (Activity) tryGetActivity;
            }
            if (!(tryGetActivity instanceof ContextWrapper)) {
                break;
            }
            tryGetActivity = ((ContextWrapper) tryGetActivity).getBaseContext();
        }
        return null;
    }

    public static final C5H3 LJZI(InterfaceC65784Pro initializer) {
        o.LJIIIZ(initializer, "initializer");
        return C221108m2.LIZ(EnumC221088m0.NONE, initializer);
    }

    public static boolean LJZL(Context context) {
        boolean z = false;
        if (e1.LIZ(31744, "record_toolbar_small_screen_adaptation", true, false)) {
            return true;
        }
        try {
            if (C81184Vtc.LIZIZ(context) / context.getResources().getDisplayMetrics().density < 416 + 274.5d) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return !z;
    }

    @Override // X.InterfaceC006400u
    public boolean LIZJ(InterfaceC31355CSh it) {
        o.LJIIIZ(it, "it");
        return it.LJIIIZ();
    }

    public static final List LJJIIZI(List list, EnumC46460ILg inviteStatus) {
        ArrayList arrayList;
        boolean z;
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(inviteStatus, "inviteStatus");
        boolean z2 = true;
        if (inviteStatus == EnumC46460ILg.UNKNOWN) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ForumStruct forumStruct = (ForumStruct) it.next();
                Integer collectionCategory = forumStruct.getCollectionCategory();
                int value = T7P.INVITATION.getValue();
                if (collectionCategory == null || collectionCategory.intValue() != value) {
                    z = false;
                } else {
                    z = true;
                }
                arrayList.add(T6W.LIZJ(forumStruct, z, true));
            }
        } else {
            if (inviteStatus != EnumC46460ILg.IS_INVITE) {
                z2 = false;
            }
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(T6W.LIZJ((ForumStruct) it2.next(), z2, false));
            }
        }
        return arrayList;
    }

    public static final boolean LJJZZI(Activity activity, boolean z) {
        if (activity == null) {
            return z;
        }
        if (activity instanceof ActivityC86117Xqz) {
            return ((ActivityC86117Xqz) activity).isActive();
        }
        return z;
    }

    public static final InterfaceC07790Sh LJLIIL(InterfaceC07790Sh interfaceC07790Sh, C0SP overscrollEffect) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(overscrollEffect, "overscrollEffect");
        return interfaceC07790Sh.LLLIIIL(overscrollEffect.LIZIZ());
    }

    public static final void LJLJJI(MutableLiveData mutableLiveData, Object obj) {
        o.LJIIIZ(mutableLiveData, "<this>");
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }

    public static final void LJLJJLL(int i, C207728Dg c207728Dg) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = c207728Dg.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
        }
        c207728Dg.requestLayout();
    }

    public static void LJLJL(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C80418VhG) {
            ((C80418VhG) background).LJIIJ(f);
        }
    }

    public static final void LJLJLJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJLJLLL(int i, View view) {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void LJLL(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void LJLLI(int i, View view) {
        o.LJIIIZ(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void LJLLJ(View view, C80418VhG c80418VhG) {
        V1F v1f = c80418VhG.LJLIL.LIZIZ;
        if (v1f != null && v1f.LIZ) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += C16360ka.LJIIIIZZ((View) parent);
            }
            C80421VhJ c80421VhJ = c80418VhG.LJLIL;
            if (c80421VhJ.LJIIL != f) {
                c80421VhJ.LJIIL = f;
                c80418VhG.LJIILLIIL();
            }
        }
    }

    public static final void LJLLL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJLLLL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static void LL(File file, V1E v1e) {
        v1e.LIZ(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LL(file2, v1e);
                } else {
                    v1e.LIZIZ(file2);
                }
            }
        }
        v1e.LIZJ(file);
    }

    @Override // X.InterfaceC75158Tec
    public void LJIILL(Exception exc, String str) {
        LJLIIIL(false);
    }

    @Override // X.InterfaceC75158Tec
    public void LJIILJJIL(int i, int i2, String str) {
        LJLIIIL(true);
    }

    @Override // X.InterfaceC173286r6
    public void LJIILLIIL(boolean z, C67233Qa5 c67233Qa5, ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        if (z) {
            FMX.LJIIL("push_withdraw_success", C67233Qa5.LIZ(c67233Qa5));
            aRunnableS14S0201000_11.run();
        }
    }

    @Override // X.InterfaceC173286r6
    public void LIZIZ(Context context, C67230Qa2 c67230Qa2, List list, ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        C67231Qa3.LIZ(this, context, c67230Qa2, list, aRunnableS14S0201000_11);
    }
}
