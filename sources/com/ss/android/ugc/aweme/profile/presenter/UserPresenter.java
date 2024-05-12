package com.ss.android.ugc.aweme.profile.presenter;

import X.C188727au;
import X.C45243HpH;
import X.C9WG;
import X.C9WY;
import X.FMX;
import X.HG3;
import X.InterfaceC26189APp;
import X.InterfaceC26319AUp;
import X.RBX;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class UserPresenter implements WeakHandler.IHandler, C9WG {
    public InterfaceC26319AUp avatarUploadTracker;
    public boolean isAllowStatusUpdating;
    public boolean isAvatarUpdating;
    public boolean isBirthdayUpdating;
    public boolean isCoverUpdating;
    public boolean isEnrollYearUpdating;
    public boolean isFromNewBlueVChange;
    public boolean isNickNameUpdating;
    public boolean isProfileWidgetUpdating;
    public boolean isRemovingVerification;
    public boolean isSchoolUpdating;
    public boolean isSecretUpdating;
    public boolean isSignatureUpdating;
    public boolean isSupportedNgoUpdating;
    public boolean isUpdateNickNameRemovingVerification;
    public boolean isUpdateUserIdRemovingVerification;
    public boolean isUserIdUpdating;
    public boolean isUserQuerying;
    public WeakHandler mHandler;
    public int mPageFrom;
    public InterfaceC26189APp mView;

    public UserPresenter() {
        this(0);
    }

    private void resetState() {
        this.isUserQuerying = false;
        this.isBirthdayUpdating = false;
        this.isNickNameUpdating = false;
        this.isSignatureUpdating = false;
        this.isSupportedNgoUpdating = false;
        this.isProfileWidgetUpdating = false;
        this.isAvatarUpdating = false;
        this.isCoverUpdating = false;
        this.isAllowStatusUpdating = false;
        this.isSecretUpdating = false;
        this.isSchoolUpdating = false;
        this.isEnrollYearUpdating = false;
        this.isFromNewBlueVChange = false;
    }

    public Boolean getIsUpdateUserIdRemovingVerification() {
        return Boolean.valueOf(this.isUpdateUserIdRemovingVerification);
    }

    public boolean queryUser() {
        if (this.isUserQuerying) {
            return false;
        }
        this.isUserQuerying = true;
        HG3.LJIILL().queryUser(this.mHandler);
        return true;
    }

    public UserPresenter(int i) {
        this.isUpdateUserIdRemovingVerification = true;
        this.mPageFrom = i;
        resetState();
        this.mHandler = new WeakHandler(this);
    }

    @Override // X.C9WG
    public void bindView(InterfaceC26189APp interfaceC26189APp) {
        this.mView = interfaceC26189APp;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Object obj = message.obj;
        if (obj instanceof Exception) {
            handleException((Exception) obj, message.what);
            return;
        }
        if (obj instanceof User) {
            handleData((User) obj, message.what);
            return;
        }
        if (obj instanceof com.ss.android.ugc.aweme.profile.UserResponse) {
            com.ss.android.ugc.aweme.profile.UserResponse userResponse = (com.ss.android.ugc.aweme.profile.UserResponse) obj;
            if (userResponse.getAction() == 1) {
                handleIllegalInfo(userResponse.status_msg, true);
                handleException(null, message.what);
                return;
            } else if (userResponse.getAction() == 2) {
                handleIllegalInfo(userResponse.status_msg, false);
                handleException(null, message.what);
                return;
            } else {
                handleData(userResponse.getUser(), message.what);
                return;
            }
        }
        if (!(obj instanceof BaseResponse)) {
            return;
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.status_code != 0) {
            handleIllegalInfo(baseResponse.status_msg, false);
            handleException(null, message.what);
        } else {
            handleData(null, message.what);
        }
    }

    public void removeVerification(String str) {
        if (this.isRemovingVerification) {
            return;
        }
        this.isRemovingVerification = true;
        HG3.LJIILL().removeVerification(this.mHandler, str);
    }

    public void setAvatarUploadTracker(InterfaceC26319AUp interfaceC26319AUp) {
        this.avatarUploadTracker = interfaceC26319AUp;
    }

    public void setUpdateNickNameRemovingVerification(boolean z) {
        this.isFromNewBlueVChange = true;
        this.isUpdateNickNameRemovingVerification = z;
    }

    public void setUpdateUserIdRemovingVerification(boolean z) {
        this.isFromNewBlueVChange = true;
        this.isUpdateUserIdRemovingVerification = z;
    }

    public void updateAllowStatus(int i) {
        if (this.isAllowStatusUpdating) {
            return;
        }
        this.isAllowStatusUpdating = true;
        HG3.LJIILL().updateAllowStatus(this.mHandler, i, this.mPageFrom);
    }

    public void updateAvatar(String str) {
        if (this.isAvatarUpdating) {
            return;
        }
        this.isAvatarUpdating = true;
        HG3.LJIILL().updateAvatarUri(this.mHandler, str, this.mPageFrom);
    }

    public void updateNickName(String str) {
        if (this.isNickNameUpdating) {
            return;
        }
        this.isNickNameUpdating = true;
        HG3.LJIILL().updateNickName(this.mHandler, str, this.mPageFrom, null);
    }

    public void updateProfileWidgetShouldShow(boolean z) {
        if (this.isProfileWidgetUpdating) {
            return;
        }
        this.isProfileWidgetUpdating = true;
        HG3.LJIILL().updateProfileWidgetShouldShow(this.mHandler, z, this.mPageFrom);
    }

    public void updateSchoolShowRange(int i) {
        if (this.isSchoolUpdating) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("school_visible", String.valueOf(i));
        hashMap.put("page_from", String.valueOf(this.mPageFrom));
        HG3.LJIILL().updateSchool(this.mHandler, hashMap);
        this.isSchoolUpdating = true;
    }

    public void updateSignature(String str) {
        if (this.isSignatureUpdating) {
            return;
        }
        this.isSignatureUpdating = true;
        HG3.LJIILL().updateSignature(this.mHandler, str, this.mPageFrom);
    }

    public void updateSupportedNgo(int i) {
        if (this.isSupportedNgoUpdating) {
            return;
        }
        this.isSupportedNgoUpdating = true;
        HG3.LJIILL().updateSupportedNgo(this.mHandler, i, this.mPageFrom);
    }

    @Override // X.C9WG
    public void updateUserId(String str) {
        if (this.isUserIdUpdating) {
            return;
        }
        this.isUserIdUpdating = true;
        HG3.LJIILL().updateId(this.mHandler, str, this.mPageFrom);
    }

    public void updateUserInfo(Map<String, String> map) {
        if (map == null || map.size() == 0 || this.isUserQuerying) {
            return;
        }
        this.isUserQuerying = true;
        map.put("page_from", String.valueOf(this.mPageFrom));
        HG3.LJIILL().updateUserInfo(this.mHandler, map);
    }

    @Override // X.C9WG
    public void updateUserSecret(boolean z) {
        updateUserSecret(z, false);
    }

    private void changeNameRemoveVerification(User user, boolean z) {
        if (user.getCustomVerify() == null || user.getEnterpriseVerifyReason() == null) {
            return;
        }
        if ((user.getCustomVerify().equals("") && user.getEnterpriseVerifyReason().equals("")) || !z) {
            return;
        }
        SpecialAccount specialAccount = user.specialAccount;
        if (specialAccount != null) {
            if (specialAccount.getSeller() == null) {
                removeVerification(user.getUniqueId());
                return;
            } else {
                if (user.specialAccount.getSeller().getType() == 1) {
                    return;
                }
                removeVerification(user.getUniqueId());
                return;
            }
        }
        removeVerification(user.getUniqueId());
    }

    private void handleIllegalInfo(String str, boolean z) {
        this.isUserQuerying = false;
        this.isNickNameUpdating = false;
        InterfaceC26189APp interfaceC26189APp = this.mView;
        if (interfaceC26189APp != null) {
            interfaceC26189APp.vb0(str, z);
        }
    }

    public void handleData(User user, int i) {
        String str;
        String str2;
        if (user == null && i != 128) {
            return;
        }
        if (i != 0) {
            if (i != 2) {
                if (i != 112) {
                    if (i != 116) {
                        if (i != 122) {
                            if (i != 128) {
                                if (i != 4) {
                                    if (i != 5) {
                                        switch (i) {
                                            case 8:
                                                this.isSchoolUpdating = false;
                                                break;
                                            case 9:
                                                this.isEnrollYearUpdating = false;
                                                break;
                                            case 10:
                                                this.isCoverUpdating = false;
                                                ((RBX) HG3.LJIILL()).updateCurCover(user.getCoverUrls());
                                                break;
                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                this.isCoverUpdating = false;
                                                ((RBX) HG3.LJIILL()).updateCurVideoCover(user.getVideoCover());
                                                break;
                                            case 12:
                                                this.isSupportedNgoUpdating = false;
                                                ((RBX) HG3.LJIILL()).updateCurSupportedNgo(user.getProfileNgoStruct());
                                                break;
                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                this.isProfileWidgetUpdating = false;
                                                ((RBX) HG3.LJIILL()).updateCurSupportedNgo(user.getProfileNgoStruct());
                                                break;
                                        }
                                    } else {
                                        this.isAllowStatusUpdating = false;
                                        ((RBX) HG3.LJIILL()).updateCurAllowStatus(user.getAllowStatus());
                                    }
                                } else {
                                    ((RBX) HG3.LJIILL()).getCurUser().setAvatarUpdateReminder(false);
                                    this.isAvatarUpdating = false;
                                    ((RBX) HG3.LJIILL()).updateCurAvatar(user.getAvatarThumb(), user.getAvatarMedium(), user.getAvatarLarger());
                                }
                            } else {
                                this.isRemovingVerification = false;
                                ((RBX) HG3.LJIILL()).removeCurVerification();
                            }
                        } else {
                            this.isSecretUpdating = false;
                            ((RBX) HG3.LJIILL()).updateCurSecret(user.isSecret());
                        }
                    } else {
                        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                        HG3.LJIIL();
                        HG3.LJLJL.LJIIIZ().updateMethodInfo("update_name", curUser.getUniqueId());
                        curUser.setNicknameUpdateReminder(false);
                        this.isUserIdUpdating = false;
                        ((RBX) HG3.LJIILL()).updateCurUserId(user.getUniqueId());
                        if (user.getCustomVerify() == null) {
                            user.setCustomVerify("");
                        }
                        if (user.getEnterpriseVerifyReason() == null) {
                            user.setEnterpriseVerifyReason("");
                        }
                        changeNameRemoveVerification(user, this.isUpdateUserIdRemovingVerification);
                        if (this.isUpdateUserIdRemovingVerification) {
                            str2 = "BVusernamechange_click_change_name_change";
                        } else {
                            str2 = "BVusernamechange_click_submit_request_submit";
                        }
                        if (this.isFromNewBlueVChange) {
                            C9WY.LIZIZ(str2);
                        }
                    }
                } else {
                    UrlModel avatarVideoUri = user.getAvatarVideoUri();
                    if (avatarVideoUri != null && avatarVideoUri.getUrlList() != null && avatarVideoUri.getUrlList().size() > 0) {
                        ((RBX) HG3.LJIILL()).getCurUser().setAvatarUpdateReminder(false);
                    }
                    this.isUserQuerying = false;
                    ((RBX) HG3.LJIILL()).updateCurUser(user);
                }
            } else {
                this.isSignatureUpdating = false;
                ((RBX) HG3.LJIILL()).updateCurSignature(user.getSignature());
            }
        } else {
            this.isNickNameUpdating = false;
            changeNameRemoveVerification(user, this.isUpdateNickNameRemovingVerification);
            if (this.isUpdateNickNameRemovingVerification) {
                str = "BVnamechange_click_change_name_change";
            } else {
                str = "BVnamechange_click_submit_request_submit";
            }
            if (this.isFromNewBlueVChange) {
                C9WY.LIZIZ(str);
            }
            ((RBX) HG3.LJIILL()).updateCurNickname(user.getNickname());
        }
        InterfaceC26189APp interfaceC26189APp = this.mView;
        if (interfaceC26189APp != null) {
            interfaceC26189APp.Pp0(user, i);
            if (!this.isAvatarUpdating && !this.isBirthdayUpdating && !this.isNickNameUpdating && !this.isSignatureUpdating && !this.isSupportedNgoUpdating && !this.isUserIdUpdating && !this.isUserQuerying && !this.isSecretUpdating && !this.isCoverUpdating && !this.isRemovingVerification) {
                this.mView.FI(true);
            }
        }
        InterfaceC26319AUp interfaceC26319AUp = this.avatarUploadTracker;
        if (interfaceC26319AUp != null) {
            interfaceC26319AUp.LIZLLL();
        }
    }

    public void handleException(Exception exc, int i) {
        String str;
        String str2;
        if (i != 0) {
            if (i != 112) {
                if (i != 116) {
                    if (i != 122) {
                        if (i != 128) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i != 5) {
                                            switch (i) {
                                                case 8:
                                                    this.isSchoolUpdating = false;
                                                    break;
                                                case 9:
                                                    this.isEnrollYearUpdating = false;
                                                    break;
                                                case 10:
                                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                    this.isCoverUpdating = false;
                                                    break;
                                                case 12:
                                                    this.isSupportedNgoUpdating = false;
                                                    break;
                                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                    this.isProfileWidgetUpdating = false;
                                                    break;
                                            }
                                        } else {
                                            this.isAllowStatusUpdating = false;
                                        }
                                    } else {
                                        this.isAvatarUpdating = false;
                                    }
                                } else {
                                    this.isBirthdayUpdating = false;
                                }
                            } else {
                                this.isSignatureUpdating = false;
                            }
                        } else {
                            this.isRemovingVerification = false;
                        }
                    } else {
                        this.isSecretUpdating = false;
                    }
                } else {
                    if (this.isUpdateUserIdRemovingVerification) {
                        str2 = "BVusernamechange_click_change_name_change";
                    } else {
                        str2 = "BVusernamechange_click_submit_request_submit";
                    }
                    if (this.isFromNewBlueVChange) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJFF(Boolean.FALSE, "submit_success");
                        FMX.LJIIL(str2, c188727au.LIZ);
                    }
                    this.isUserIdUpdating = false;
                }
            } else {
                this.isUserQuerying = false;
            }
        } else {
            if (this.isUpdateNickNameRemovingVerification) {
                str = "BVnamechange_click_change_name_change";
            } else {
                str = "BVnamechange_click_submit_request_submit";
            }
            if (this.isFromNewBlueVChange) {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJFF(Boolean.FALSE, "submit_success");
                FMX.LJIIL(str, c188727au2.LIZ);
            }
            this.isNickNameUpdating = false;
        }
        InterfaceC26189APp interfaceC26189APp = this.mView;
        if (interfaceC26189APp != null && exc != null) {
            interfaceC26189APp.Xa(exc, i);
            if (!this.isAvatarUpdating && !this.isBirthdayUpdating && !this.isNickNameUpdating && !this.isSignatureUpdating && !this.isSupportedNgoUpdating && !this.isProfileWidgetUpdating && !this.isUserIdUpdating && !this.isUserQuerying && !this.isSecretUpdating && !this.isCoverUpdating && !this.isRemovingVerification) {
                this.mView.FI(false);
            }
        }
        InterfaceC26319AUp interfaceC26319AUp = this.avatarUploadTracker;
        if (interfaceC26319AUp != null) {
            interfaceC26319AUp.LJ(exc);
        }
    }

    public void updateCover(String str, int i) {
        if (this.isCoverUpdating) {
            return;
        }
        this.isCoverUpdating = true;
        HG3.LJIILL().updateCoverUri(this.mHandler, str, i, this.mPageFrom);
    }

    public void updateNickNameWithSupplementary(String str, List<String> list) {
        if (this.isNickNameUpdating) {
            return;
        }
        this.isNickNameUpdating = true;
        HG3.LJIILL().updateNickNameWithSupplementray(this.mHandler, str, list, this.mPageFrom);
    }

    public void updateSupportedNgoPercent(String str, String str2) {
        if (this.isSupportedNgoUpdating) {
            return;
        }
        this.isSupportedNgoUpdating = true;
        HG3.LJIILL().updateSupportedNgoPercent(this.mHandler, str, str2, this.mPageFrom);
    }

    public void updateUserSecret(boolean z, boolean z2) {
        if (this.isSecretUpdating) {
            return;
        }
        this.isSecretUpdating = true;
        HG3.LJIILL().updateSecret(this.mHandler, z, this.mPageFrom, z2);
    }

    public void updateVideoCover(String str, String str2, int i) {
        if (this.isCoverUpdating) {
            return;
        }
        this.isCoverUpdating = true;
        HG3.LJIILL().updateVideoCoverUri(this.mHandler, str, str2, i, this.mPageFrom);
    }

    public void updateSchool(String str, String str2, String str3, int i, int i2) {
        if (this.isSchoolUpdating) {
            return;
        }
        HashMap LIZ = C45243HpH.LIZ("school_name", str, "college_name", str2);
        LIZ.put("enroll_year", str3);
        LIZ.put("education", String.valueOf(i));
        LIZ.put("school_visible", String.valueOf(i2));
        LIZ.put("page_from", String.valueOf(this.mPageFrom));
        HG3.LJIILL().updateSchool(this.mHandler, LIZ);
        this.isSchoolUpdating = true;
    }
}
