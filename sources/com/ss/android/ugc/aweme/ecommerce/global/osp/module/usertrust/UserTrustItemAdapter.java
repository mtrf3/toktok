package com.ss.android.ugc.aweme.ecommerce.global.osp.module.usertrust;

import X.AbstractC28801Bc;
import X.AnonymousClass636;
import X.C06490Nh;
import X.C0AX;
import X.C16880lQ;
import X.C221108m2;
import X.C26705Adx;
import X.C26706Ady;
import X.C29127Bbv;
import X.C36922EeM;
import X.C5H3;
import X.C76800UCe;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79045V0n;
import X.C79234V7u;
import X.C7MY;
import X.C97663sQ;
import X.InterfaceC88472Yns;
import X.OUP;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.usertrust.IUserTrustStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.ImageRichText;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class UserTrustItemAdapter extends AbstractC28801Bc<UserTrustItemDescriptionChunk, C26705Adx> implements c {
    public List<UserTrustItemDescriptionChunk> dataList;
    public InterfaceC88472Yns<? super LinkText, C76800UCe> loggerBlock;
    public int textResColor;
    public final C5H3 userTrustStyle$delegate;

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        return com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(this, viewGroup, i);
    }

    private final IUserTrustStyle getUserTrustStyle() {
        return (IUserTrustStyle) this.userTrustStyle$delegate.getValue();
    }

    @Override // X.AbstractC28801Bc, X.AbstractC029409q
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final List<UserTrustItemDescriptionChunk> getDataList() {
        return this.dataList;
    }

    public final InterfaceC88472Yns<LinkText, C76800UCe> getLoggerBlock() {
        return this.loggerBlock;
    }

    public final int getTextResColor() {
        return this.textResColor;
    }

    public final int calWidth(Image image) {
        Integer width = image.getWidth();
        if (width != null) {
            int intValue = width.intValue();
            if (image.getHeight() != null) {
                return (int) ((intValue * C7MY.LIZIZ(24)) / r0.intValue());
            }
            return 0;
        }
        return 0;
    }

    public final void setDataList(List<UserTrustItemDescriptionChunk> list) {
        o.LJIIIZ(list, "<set-?>");
        this.dataList = list;
    }

    public final void setLoggerBlock(InterfaceC88472Yns<? super LinkText, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.loggerBlock = interfaceC88472Yns;
    }

    public final void setTextResColor(int i) {
        this.textResColor = i;
    }

    public final void updateUserTrustInfo(List<UserTrustItemDescriptionChunk> dataList) {
        o.LJIIIZ(dataList, "dataList");
        this.dataList = dataList;
        submitList(dataList);
    }

    private final void initImageView(C26705Adx c26705Adx, UserTrustItemDescriptionChunk userTrustItemDescriptionChunk) {
        String str;
        int i = 0;
        c26705Adx.LJLIL.setVisibility(0);
        c26705Adx.LJLILLLLZI.setVisibility(8);
        c26705Adx.LJLJI.setVisibility(0);
        TuxTextView tuxTextView = c26705Adx.LJLJJI;
        ImageRichText imageRichText = userTrustItemDescriptionChunk.textWithImage;
        if (imageRichText != null) {
            str = imageRichText.text;
        } else {
            str = null;
        }
        OUP.LJJLIIIJILLIZJL(tuxTextView, str);
        TuxTextView tuxTextView2 = c26705Adx.LJLJJI;
        Context context = c26705Adx.itemView.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        Integer LJI = C79045V0n.LJI(this.textResColor, context);
        if (LJI != null) {
            i = LJI.intValue();
        }
        tuxTextView2.setTextColor(i);
        c26705Adx.LJLJJL.setGravity(-1);
        AqS93S0300000_4 aqS93S0300000_4 = new AqS93S0300000_4(c26705Adx, userTrustItemDescriptionChunk, this, 95);
        if (c26705Adx.LJLJJL.getWidth() == 0) {
            c26705Adx.LJLJJL.post(new ARunnableS40S0100000_4((Object) aqS93S0300000_4, 41));
        } else {
            aqS93S0300000_4.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private final void initTextView(C26705Adx c26705Adx, UserTrustItemDescriptionChunk userTrustItemDescriptionChunk) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i = 0;
        c26705Adx.LJLIL.setVisibility(0);
        c26705Adx.LJLJI.setVisibility(8);
        ?? ctx = c26705Adx.itemView.getContext();
        try {
            LinkRichText linkRichText = userTrustItemDescriptionChunk.textWithLink;
            if (linkRichText != null && (str = linkRichText.textColor) != null) {
                ctx = Color.parseColor(str);
            } else {
                o.LJIIIIZZ(ctx, "ctx");
                ctx = AnonymousClass636.LJIIIIZZ(this.textResColor, ctx);
            }
        } catch (Throwable unused) {
            o.LJIIIIZZ(ctx, "ctx");
            ctx = AnonymousClass636.LJIIIIZZ(this.textResColor, ctx);
        }
        TuxTextView tuxTextView = c26705Adx.LJLILLLLZI;
        tuxTextView.setVisibility(0);
        tuxTextView.setClickable(true);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        LinkRichText linkRichText2 = userTrustItemDescriptionChunk.textWithLink;
        if (linkRichText2 != null) {
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            Context context = tuxTextView.getContext();
            o.LJIIIIZZ(context, "context");
            spannableStringBuilder = RichTextUtil.LIZJ(richTextUtil, context, linkRichText2, Integer.valueOf((int) ctx), 0, false, null, new AqS170S0100000_4(this, 350), 56);
        } else {
            spannableStringBuilder = null;
        }
        tuxTextView.setText(spannableStringBuilder);
        Context context2 = tuxTextView.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(this.textResColor, context2);
        if (LJI != null) {
            i = LJI.intValue();
        }
        tuxTextView.setTextColor(i);
        tuxTextView.setTuxFont(getUserTrustStyle().getPolicyFont());
    }

    @Override // X.AbstractC029409q
    public void onBindViewHolder(C26705Adx holder, int i) {
        o.LJIIIZ(holder, "holder");
        UserTrustItemDescriptionChunk userTrustItemDescriptionChunk = (UserTrustItemDescriptionChunk) ListProtector.get(this.dataList, i);
        Integer num = userTrustItemDescriptionChunk.type;
        if (num != null) {
            if (num.intValue() == 1) {
                initTextView(holder, userTrustItemDescriptionChunk);
                return;
            } else if (num.intValue() == 2) {
                initImageView(holder, userTrustItemDescriptionChunk);
                return;
            }
        }
        holder.LJLIL.setVisibility(0);
        holder.LJLILLLLZI.setVisibility(8);
        holder.LJLJI.setVisibility(0);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder, reason: merged with bridge method [inline-methods] */
    public C26705Adx com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.zc, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new C26705Adx(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTrustItemAdapter(List<UserTrustItemDescriptionChunk> dataList, int i, InterfaceC88472Yns<? super LinkText, C76800UCe> loggerBlock) {
        super(new C97663sQ(0));
        o.LJIIIZ(dataList, "dataList");
        o.LJIIIZ(loggerBlock, "loggerBlock");
        this.dataList = dataList;
        this.textResColor = i;
        this.loggerBlock = loggerBlock;
        this.userTrustStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 320));
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder(UserTrustItemAdapter userTrustItemAdapter, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___ = userTrustItemAdapter.com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(viewGroup, i);
        C0AX.LIZ(viewGroup, com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView, R.id.lj7);
        return com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___;
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder(UserTrustItemAdapter userTrustItemAdapter, ViewGroup viewGroup, int i) {
        View view;
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder = com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder(userTrustItemAdapter, viewGroup, i);
        if (com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder != null && (view = com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder.itemView) != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        return com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder;
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(UserTrustItemAdapter userTrustItemAdapter, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder = com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder(userTrustItemAdapter, viewGroup, i);
        try {
            if (com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.getClass().getName();
        return com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder;
    }
}
