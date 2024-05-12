package com.ss.android.ugc.aweme.setting.adapter;

import X.C16880lQ;
import X.C2NU;
import X.C38333F2r;
import X.C57082Lw;
import X.C57162Me;
import X.C5S1;
import X.C62562cu;
import X.C62905OmT;
import X.C62906OmU;
import X.C71799SFv;
import X.C7FA;
import X.EF7;
import X.FGR;
import X.SY4;
import X.V16;
import X.X1D;
import Y.IDCListenerS158S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public class BlackHolder extends RecyclerView.ViewHolder implements View.OnClickListener, WeakHandler.IHandler {
    public Activity mActivity;
    public C71799SFv mAiHead;
    public SY4 mBlackBtn;
    public int mBlockSource;
    public WeakHandler mHandler;
    public boolean mIsStory;
    public View mLlRoot;
    public int mThemeMode;
    public TextView mTvName;
    public TextView mTvOpusFans;
    public User mUser;

    public static /* synthetic */ void L(BlackHolder blackHolder, DialogInterface dialogInterface, int i) {
        blackHolder.lambda$showBlockDialog$0(dialogInterface, i);
    }

    private int getBlockResId() {
        if (this.mIsStory) {
            return R.string.cam;
        }
        return R.string.cai;
    }

    private int getUnBlockResId() {
        if (this.mIsStory) {
            return R.string.tcj;
        }
        return R.string.tci;
    }

    private boolean isBlock() {
        if (this.mIsStory) {
            StoryBlockInfo storyBlockInfo = this.mUser.getStoryBlockInfo();
            if (storyBlockInfo == null) {
                return false;
            }
            return storyBlockInfo.isBlock();
        }
        return this.mUser.isBlock();
    }

    private void setThemeMode() {
        if (this.mThemeMode == 0) {
            return;
        }
        this.mLlRoot.setBackground(null);
        this.mTvName.setTextColor(this.mLlRoot.getResources().getColor(R.color.bk));
        this.mTvOpusFans.setTextColor(this.mLlRoot.getResources().getColor(R.color.cq));
    }

    private void showBlockDialog() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        C62905OmT c62905OmT = new C62905OmT(this.mActivity);
        c62905OmT.LIZ(R.string.h4f);
        c62905OmT.LJIIJJI(R.string.dsg, new IDCListenerS158S0100000_4(this, 12), false);
        c62905OmT.LJIIIIZZ(R.string.cg_, null, false);
        new C62906OmU(c62905OmT).LIZLLL();
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_setting_adapter_BlackHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    private void displayBlockStatus(boolean z) {
        if (z) {
            this.mBlackBtn.setText(getUnBlockResId());
            this.mBlackBtn.setButtonVariant(5);
        } else {
            this.mBlackBtn.setText(getBlockResId());
            this.mBlackBtn.setButtonVariant(0);
        }
        this.mBlackBtn.getClass();
    }

    private void doBlock(boolean z) {
        int i;
        WeakHandler weakHandler = this.mHandler;
        final String uid = this.mUser.getUid();
        final String secUid = this.mUser.getSecUid();
        boolean z2 = !z;
        final int i2 = this.mBlockSource;
        FGR LIZIZ = FGR.LIZIZ();
        final int i3 = z2 ? 1 : 0;
        Callable<?> callable = new Callable() { // from class: X.9mR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BlockApi.LIZ.block(uid, secUid, i3, i2).execute().LIZIZ;
            }
        };
        if (i2 == 1) {
            i = 32;
        } else {
            i = 31;
        }
        LIZIZ.LIZ(weakHandler, callable, i);
        if (z) {
            C57162Me.LIZ(this.mUser.getUid());
            V16.LJJLJLI("black_list", this.mUser.getUid());
        } else {
            C57162Me.LIZ(this.mUser.getUid());
            V16.LJFF("black_list", this.mUser.getUid(), "");
        }
        this.mUser.isBlock = z2;
        IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIZILJ(IMUser.fromUser(this.mUser));
    }

    public void bind(User user) {
        bind(user, 0);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i;
        int i2;
        if (this.mActivity.isFinishing()) {
            return;
        }
        int i3 = message.what;
        Object obj = message.obj;
        if (i3 == 31 || i3 == 32) {
            if (obj instanceof ExecutionException) {
                obj = ((Throwable) obj).getCause();
            }
            if (obj instanceof C38333F2r) {
                C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                c5s1.LIZLLL(((C38333F2r) obj).getErrorMsg());
                c5s1.LJ();
                return;
            }
            if (obj instanceof Exception) {
                C5S1 c5s12 = new C5S1(EF7.LIZIZ());
                c5s12.LIZJ(R.string.im9);
                c5s12.LJ();
                return;
            }
            if (!(obj instanceof BlockStruct)) {
                return;
            }
            boolean z = true;
            if (((BlockStruct) obj).blockStatus != 1) {
                z = false;
            }
            if (i3 == 32) {
                StoryBlockInfo storyBlockInfo = this.mUser.getStoryBlockInfo();
                if (storyBlockInfo == null) {
                    storyBlockInfo = new StoryBlockInfo();
                    this.mUser.setStoryBlockInfo(storyBlockInfo);
                }
                storyBlockInfo.setBlock(z);
                displayBlockStatus(storyBlockInfo.isBlock());
                Resources resources = this.mActivity.getResources();
                if (z) {
                    i2 = R.string.can;
                } else {
                    i2 = R.string.tck;
                }
                String string = resources.getString(i2);
                C5S1 c5s13 = new C5S1(EF7.LIZIZ());
                c5s13.LIZLLL(string);
                c5s13.LJ();
            } else {
                this.mUser.setBlock(z);
                Activity activity = this.mActivity;
                if (activity != null) {
                    C5S1 c5s14 = new C5S1(activity);
                    Resources resources2 = activity.getResources();
                    if (z) {
                        i = R.string.bnl;
                    } else {
                        i = R.string.tci;
                    }
                    c5s14.LIZLLL(resources2.getString(i));
                    c5s14.LJ();
                }
                displayBlockStatus(this.mUser.isBlock());
            }
            C57082Lw.LIZ.LIZIZ("aweme.main.profile.more_page_user_info_change").postValue(this.mUser);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_adapter_BlackHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(EF7.LIZIZ())) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        int id = view.getId();
        if (id == R.id.alt) {
            if (!isBlock()) {
                showBlockDialog();
                return;
            } else {
                doBlock(true);
                return;
            }
        }
        if (id != R.id.alx) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.mActivity, "aweme://user/profile/");
        buildRoute.withParam("uid", this.mUser.getUid());
        buildRoute.withParam("sec_user_id", this.mUser.getSecUid());
        buildRoute.open();
    }

    public BlackHolder(View view, Activity activity) {
        super(view);
        this.mActivity = activity;
        this.mAiHead = (C71799SFv) view.findViewById(R.id.alu);
        this.mTvName = (TextView) view.findViewById(R.id.alv);
        this.mTvOpusFans = (TextView) view.findViewById(R.id.alw);
        this.mLlRoot = view.findViewById(R.id.alx);
        SY4 sy4 = (SY4) view.findViewById(R.id.alt);
        this.mBlackBtn = sy4;
        C7FA.LIZIZ(sy4);
        this.mHandler = new WeakHandler(this);
        C16880lQ.LJJIZ(this.mBlackBtn, this);
    }

    public /* synthetic */ void lambda$showBlockDialog$0(DialogInterface dialogInterface, int i) {
        doBlock(false);
    }

    public void bind(User user, int i) {
        bind(user, i, 0);
    }

    public void bind(User user, int i, int i2) {
        boolean z;
        String uniqueId;
        if (user == null) {
            return;
        }
        this.mThemeMode = i2;
        setThemeMode();
        this.mBlockSource = i;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.mIsStory = z;
        this.mUser = user;
        StoryBlockInfo storyBlockInfo = user.getStoryBlockInfo();
        if (this.mIsStory) {
            if (storyBlockInfo == null) {
                StoryBlockInfo storyBlockInfo2 = new StoryBlockInfo();
                storyBlockInfo2.setBlock(true);
                this.mUser.setStoryBlockInfo(storyBlockInfo2);
            }
            displayBlockStatus(true);
        } else {
            displayBlockStatus(this.mUser.isBlock);
        }
        UrlModel avatarThumb = this.mUser.getAvatarThumb();
        if (avatarThumb != null) {
            this.mAiHead.LJIIIIZZ(new C62562cu(avatarThumb.getUrlList()));
        }
        this.mTvName.setText(this.mUser.getNickname());
        TextView textView = this.mTvOpusFans;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("@");
        if (TextUtils.isEmpty(user.getUniqueId())) {
            uniqueId = user.getShortId();
        } else {
            uniqueId = user.getUniqueId();
        }
        LIZ.append(uniqueId);
        textView.setText(X1D.LIZIZ(LIZ));
    }
}
