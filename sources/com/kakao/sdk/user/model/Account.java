package com.kakao.sdk.user.model;

import X.C1FL;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Account implements Parcelable {
    public static final Parcelable.Creator<Account> CREATOR = new Creator();
    public final AgeRange ageRange;
    public final Boolean ageRangeNeedsAgreement;
    public final String birthday;
    public final Boolean birthdayNeedsAgreement;
    public final BirthdayType birthdayType;
    public final String birthyear;
    public final Boolean birthyearNeedsAgreement;
    public final String ci;
    public final Date ciAuthenticatedAt;
    public final Boolean ciNeedsAgreement;
    public final String email;
    public final Boolean emailNeedsAgreement;
    public final Gender gender;
    public final Boolean genderNeedsAgreement;
    public final Boolean isEmailValid;
    public final Boolean isEmailVerified;
    public final Boolean isKorean;
    public final Boolean isKoreanNeedsAgreement;
    public final String legalBirthDate;
    public final Boolean legalBirthDateNeedsAgreement;
    public final Gender legalGender;
    public final Boolean legalGenderNeedsAgreement;
    public final String legalName;
    public final Boolean legalNameNeedsAgreement;
    public final String name;
    public final Boolean nameNeedsAgreement;
    public final String phoneNumber;
    public final Boolean phoneNumberNeedsAgreement;
    public final Profile profile;
    public final Boolean profileImageNeedsAgreement;
    public final Boolean profileNeedsAgreement;
    public final Boolean profileNicknameNeedsAgreement;

    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<Account> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Account createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            Boolean valueOf12;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            o.LJIIIZ(parcel, "parcel");
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Profile createFromParcel = parcel.readInt() == 0 ? null : Profile.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            AgeRange valueOf18 = parcel.readInt() == 0 ? null : AgeRange.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            BirthdayType valueOf19 = parcel.readInt() == 0 ? null : BirthdayType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Gender valueOf20 = parcel.readInt() == 0 ? null : Gender.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf15 = null;
            } else {
                valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Gender valueOf21 = parcel.readInt() == 0 ? null : Gender.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf16 = null;
            } else {
                valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf17 = null;
            } else {
                valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Account(valueOf, valueOf2, valueOf3, createFromParcel, valueOf4, readString, valueOf5, valueOf6, valueOf7, readString2, valueOf8, valueOf18, valueOf9, readString3, valueOf10, readString4, valueOf19, valueOf11, valueOf20, valueOf12, readString5, date, valueOf13, readString6, valueOf14, readString7, valueOf15, valueOf21, valueOf16, readString8, valueOf17, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Account[] newArray(int i) {
            return new Account[i];
        }
    }

    public static /* synthetic */ Account copy$default(Account account, Boolean bool, Boolean bool2, Boolean bool3, Profile profile, Boolean bool4, String str, Boolean bool5, Boolean bool6, Boolean bool7, String str2, Boolean bool8, AgeRange ageRange, Boolean bool9, String str3, Boolean bool10, String str4, BirthdayType birthdayType, Boolean bool11, Gender gender, Boolean bool12, String str5, Date date, Boolean bool13, String str6, Boolean bool14, String str7, Boolean bool15, Gender gender2, Boolean bool16, String str8, Boolean bool17, Boolean bool18, int i, Object obj) {
        Boolean bool19 = bool9;
        AgeRange ageRange2 = ageRange;
        String str9 = str3;
        Boolean bool20 = bool8;
        String str10 = str2;
        Boolean bool21 = bool7;
        Boolean bool22 = bool6;
        Boolean bool23 = bool5;
        Boolean bool24 = bool2;
        Boolean bool25 = bool;
        Boolean bool26 = bool3;
        Profile profile2 = profile;
        Boolean bool27 = bool4;
        String str11 = str;
        Boolean bool28 = bool12;
        Gender gender3 = gender;
        Boolean bool29 = bool11;
        BirthdayType birthdayType2 = birthdayType;
        Boolean bool30 = bool10;
        Boolean bool31 = bool18;
        String str12 = str4;
        String str13 = str5;
        Date date2 = date;
        Boolean bool32 = bool13;
        String str14 = str6;
        Boolean bool33 = bool17;
        Boolean bool34 = bool14;
        String str15 = str7;
        Boolean bool35 = bool15;
        Gender gender4 = gender2;
        Boolean bool36 = bool16;
        String str16 = str8;
        if ((i & 1) != 0) {
            bool25 = account.profileNeedsAgreement;
        }
        if ((i & 2) != 0) {
            bool24 = account.profileNicknameNeedsAgreement;
        }
        if ((i & 4) != 0) {
            bool26 = account.profileImageNeedsAgreement;
        }
        if ((i & 8) != 0) {
            profile2 = account.profile;
        }
        if ((i & 16) != 0) {
            bool27 = account.nameNeedsAgreement;
        }
        if ((i & 32) != 0) {
            str11 = account.name;
        }
        if ((i & 64) != 0) {
            bool23 = account.emailNeedsAgreement;
        }
        if ((i & 128) != 0) {
            bool22 = account.isEmailValid;
        }
        if ((i & 256) != 0) {
            bool21 = account.isEmailVerified;
        }
        if ((i & 512) != 0) {
            str10 = account.email;
        }
        if ((i & 1024) != 0) {
            bool20 = account.ageRangeNeedsAgreement;
        }
        if ((i & 2048) != 0) {
            ageRange2 = account.ageRange;
        }
        if ((i & 4096) != 0) {
            bool19 = account.birthyearNeedsAgreement;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str9 = account.birthyear;
        }
        if ((i & 16384) != 0) {
            bool30 = account.birthdayNeedsAgreement;
        }
        if ((32768 & i) != 0) {
            str12 = account.birthday;
        }
        if ((65536 & i) != 0) {
            birthdayType2 = account.birthdayType;
        }
        if ((131072 & i) != 0) {
            bool29 = account.genderNeedsAgreement;
        }
        if ((262144 & i) != 0) {
            gender3 = account.gender;
        }
        if ((524288 & i) != 0) {
            bool28 = account.ciNeedsAgreement;
        }
        if ((1048576 & i) != 0) {
            str13 = account.ci;
        }
        if ((2097152 & i) != 0) {
            date2 = account.ciAuthenticatedAt;
        }
        if ((4194304 & i) != 0) {
            bool32 = account.legalNameNeedsAgreement;
        }
        if ((8388608 & i) != 0) {
            str14 = account.legalName;
        }
        if ((16777216 & i) != 0) {
            bool34 = account.legalBirthDateNeedsAgreement;
        }
        if ((33554432 & i) != 0) {
            str15 = account.legalBirthDate;
        }
        if ((67108864 & i) != 0) {
            bool35 = account.legalGenderNeedsAgreement;
        }
        if ((134217728 & i) != 0) {
            gender4 = account.legalGender;
        }
        if ((268435456 & i) != 0) {
            bool36 = account.phoneNumberNeedsAgreement;
        }
        if ((536870912 & i) != 0) {
            str16 = account.phoneNumber;
        }
        if ((1073741824 & i) != 0) {
            bool33 = account.isKoreanNeedsAgreement;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            bool31 = account.isKorean;
        }
        return account.copy(bool25, bool24, bool26, profile2, bool27, str11, bool23, bool22, bool21, str10, bool20, ageRange2, bool19, str9, bool30, str12, birthdayType2, bool29, gender3, bool28, str13, date2, bool32, str14, bool34, str15, bool35, gender4, bool36, str16, bool33, bool31);
    }

    public final Account copy(Boolean bool, Boolean bool2, Boolean bool3, Profile profile, Boolean bool4, String str, Boolean bool5, Boolean bool6, Boolean bool7, String str2, Boolean bool8, AgeRange ageRange, Boolean bool9, String str3, Boolean bool10, String str4, BirthdayType birthdayType, Boolean bool11, Gender gender, Boolean bool12, String str5, Date date, Boolean bool13, String str6, Boolean bool14, String str7, Boolean bool15, Gender gender2, Boolean bool16, String str8, Boolean bool17, Boolean bool18) {
        return new Account(bool, bool2, bool3, profile, bool4, str, bool5, bool6, bool7, str2, bool8, ageRange, bool9, str3, bool10, str4, birthdayType, bool11, gender, bool12, str5, date, bool13, str6, bool14, str7, bool15, gender2, bool16, str8, bool17, bool18);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        return o.LJ(this.profileNeedsAgreement, account.profileNeedsAgreement) && o.LJ(this.profileNicknameNeedsAgreement, account.profileNicknameNeedsAgreement) && o.LJ(this.profileImageNeedsAgreement, account.profileImageNeedsAgreement) && o.LJ(this.profile, account.profile) && o.LJ(this.nameNeedsAgreement, account.nameNeedsAgreement) && o.LJ(this.name, account.name) && o.LJ(this.emailNeedsAgreement, account.emailNeedsAgreement) && o.LJ(this.isEmailValid, account.isEmailValid) && o.LJ(this.isEmailVerified, account.isEmailVerified) && o.LJ(this.email, account.email) && o.LJ(this.ageRangeNeedsAgreement, account.ageRangeNeedsAgreement) && this.ageRange == account.ageRange && o.LJ(this.birthyearNeedsAgreement, account.birthyearNeedsAgreement) && o.LJ(this.birthyear, account.birthyear) && o.LJ(this.birthdayNeedsAgreement, account.birthdayNeedsAgreement) && o.LJ(this.birthday, account.birthday) && this.birthdayType == account.birthdayType && o.LJ(this.genderNeedsAgreement, account.genderNeedsAgreement) && this.gender == account.gender && o.LJ(this.ciNeedsAgreement, account.ciNeedsAgreement) && o.LJ(this.ci, account.ci) && o.LJ(this.ciAuthenticatedAt, account.ciAuthenticatedAt) && o.LJ(this.legalNameNeedsAgreement, account.legalNameNeedsAgreement) && o.LJ(this.legalName, account.legalName) && o.LJ(this.legalBirthDateNeedsAgreement, account.legalBirthDateNeedsAgreement) && o.LJ(this.legalBirthDate, account.legalBirthDate) && o.LJ(this.legalGenderNeedsAgreement, account.legalGenderNeedsAgreement) && this.legalGender == account.legalGender && o.LJ(this.phoneNumberNeedsAgreement, account.phoneNumberNeedsAgreement) && o.LJ(this.phoneNumber, account.phoneNumber) && o.LJ(this.isKoreanNeedsAgreement, account.isKoreanNeedsAgreement) && o.LJ(this.isKorean, account.isKorean);
    }

    public int hashCode() {
        Boolean bool = this.profileNeedsAgreement;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.profileNicknameNeedsAgreement;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.profileImageNeedsAgreement;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Profile profile = this.profile;
        int hashCode4 = (hashCode3 + (profile == null ? 0 : profile.hashCode())) * 31;
        Boolean bool4 = this.nameNeedsAgreement;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.name;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool5 = this.emailNeedsAgreement;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isEmailValid;
        int hashCode8 = (hashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isEmailVerified;
        int hashCode9 = (hashCode8 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str2 = this.email;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool8 = this.ageRangeNeedsAgreement;
        int hashCode11 = (hashCode10 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        AgeRange ageRange = this.ageRange;
        int hashCode12 = (hashCode11 + (ageRange == null ? 0 : ageRange.hashCode())) * 31;
        Boolean bool9 = this.birthyearNeedsAgreement;
        int hashCode13 = (hashCode12 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str3 = this.birthyear;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool10 = this.birthdayNeedsAgreement;
        int hashCode15 = (hashCode14 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str4 = this.birthday;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BirthdayType birthdayType = this.birthdayType;
        int hashCode17 = (hashCode16 + (birthdayType == null ? 0 : birthdayType.hashCode())) * 31;
        Boolean bool11 = this.genderNeedsAgreement;
        int hashCode18 = (hashCode17 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Gender gender = this.gender;
        int hashCode19 = (hashCode18 + (gender == null ? 0 : gender.hashCode())) * 31;
        Boolean bool12 = this.ciNeedsAgreement;
        int hashCode20 = (hashCode19 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str5 = this.ci;
        int hashCode21 = (hashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date = this.ciAuthenticatedAt;
        int hashCode22 = (hashCode21 + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool13 = this.legalNameNeedsAgreement;
        int hashCode23 = (hashCode22 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        String str6 = this.legalName;
        int hashCode24 = (hashCode23 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool14 = this.legalBirthDateNeedsAgreement;
        int hashCode25 = (hashCode24 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        String str7 = this.legalBirthDate;
        int hashCode26 = (hashCode25 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool15 = this.legalGenderNeedsAgreement;
        int hashCode27 = (hashCode26 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Gender gender2 = this.legalGender;
        int hashCode28 = (hashCode27 + (gender2 == null ? 0 : gender2.hashCode())) * 31;
        Boolean bool16 = this.phoneNumberNeedsAgreement;
        int hashCode29 = (hashCode28 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        String str8 = this.phoneNumber;
        int hashCode30 = (hashCode29 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool17 = this.isKoreanNeedsAgreement;
        int hashCode31 = (hashCode30 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.isKorean;
        return hashCode31 + (bool18 != null ? bool18.hashCode() : 0);
    }

    public String toString() {
        return "Account(profileNeedsAgreement=" + this.profileNeedsAgreement + ", profileNicknameNeedsAgreement=" + this.profileNicknameNeedsAgreement + ", profileImageNeedsAgreement=" + this.profileImageNeedsAgreement + ", profile=" + this.profile + ", nameNeedsAgreement=" + this.nameNeedsAgreement + ", name=" + ((Object) this.name) + ", emailNeedsAgreement=" + this.emailNeedsAgreement + ", isEmailValid=" + this.isEmailValid + ", isEmailVerified=" + this.isEmailVerified + ", email=" + ((Object) this.email) + ", ageRangeNeedsAgreement=" + this.ageRangeNeedsAgreement + ", ageRange=" + this.ageRange + ", birthyearNeedsAgreement=" + this.birthyearNeedsAgreement + ", birthyear=" + ((Object) this.birthyear) + ", birthdayNeedsAgreement=" + this.birthdayNeedsAgreement + ", birthday=" + ((Object) this.birthday) + ", birthdayType=" + this.birthdayType + ", genderNeedsAgreement=" + this.genderNeedsAgreement + ", gender=" + this.gender + ", ciNeedsAgreement=" + this.ciNeedsAgreement + ", ci=" + ((Object) this.ci) + ", ciAuthenticatedAt=" + this.ciAuthenticatedAt + ", legalNameNeedsAgreement=" + this.legalNameNeedsAgreement + ", legalName=" + ((Object) this.legalName) + ", legalBirthDateNeedsAgreement=" + this.legalBirthDateNeedsAgreement + ", legalBirthDate=" + ((Object) this.legalBirthDate) + ", legalGenderNeedsAgreement=" + this.legalGenderNeedsAgreement + ", legalGender=" + this.legalGender + ", phoneNumberNeedsAgreement=" + this.phoneNumberNeedsAgreement + ", phoneNumber=" + ((Object) this.phoneNumber) + ", isKoreanNeedsAgreement=" + this.isKoreanNeedsAgreement + ", isKorean=" + this.isKorean + ')';
    }

    public final AgeRange getAgeRange() {
        return this.ageRange;
    }

    public final Boolean getAgeRangeNeedsAgreement() {
        return this.ageRangeNeedsAgreement;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final Boolean getBirthdayNeedsAgreement() {
        return this.birthdayNeedsAgreement;
    }

    public final BirthdayType getBirthdayType() {
        return this.birthdayType;
    }

    public final String getBirthyear() {
        return this.birthyear;
    }

    public final Boolean getBirthyearNeedsAgreement() {
        return this.birthyearNeedsAgreement;
    }

    public final String getCi() {
        return this.ci;
    }

    public final Date getCiAuthenticatedAt() {
        return this.ciAuthenticatedAt;
    }

    public final Boolean getCiNeedsAgreement() {
        return this.ciNeedsAgreement;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Boolean getEmailNeedsAgreement() {
        return this.emailNeedsAgreement;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final Boolean getGenderNeedsAgreement() {
        return this.genderNeedsAgreement;
    }

    public final String getLegalBirthDate() {
        return this.legalBirthDate;
    }

    public final Boolean getLegalBirthDateNeedsAgreement() {
        return this.legalBirthDateNeedsAgreement;
    }

    public final Gender getLegalGender() {
        return this.legalGender;
    }

    public final Boolean getLegalGenderNeedsAgreement() {
        return this.legalGenderNeedsAgreement;
    }

    public final String getLegalName() {
        return this.legalName;
    }

    public final Boolean getLegalNameNeedsAgreement() {
        return this.legalNameNeedsAgreement;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getNameNeedsAgreement() {
        return this.nameNeedsAgreement;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final Boolean getPhoneNumberNeedsAgreement() {
        return this.phoneNumberNeedsAgreement;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final Boolean getProfileImageNeedsAgreement() {
        return this.profileImageNeedsAgreement;
    }

    public final Boolean getProfileNeedsAgreement() {
        return this.profileNeedsAgreement;
    }

    public final Boolean getProfileNicknameNeedsAgreement() {
        return this.profileNicknameNeedsAgreement;
    }

    public final Boolean isEmailValid() {
        return this.isEmailValid;
    }

    public final Boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public final Boolean isKorean() {
        return this.isKorean;
    }

    public final Boolean isKoreanNeedsAgreement() {
        return this.isKoreanNeedsAgreement;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Boolean bool = this.profileNeedsAgreement;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.profileNicknameNeedsAgreement;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        Boolean bool3 = this.profileImageNeedsAgreement;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        Profile profile = this.profile;
        if (profile == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            profile.writeToParcel(out, i);
        }
        Boolean bool4 = this.nameNeedsAgreement;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
        out.writeString(this.name);
        Boolean bool5 = this.emailNeedsAgreement;
        if (bool5 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool5);
        }
        Boolean bool6 = this.isEmailValid;
        if (bool6 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool6);
        }
        Boolean bool7 = this.isEmailVerified;
        if (bool7 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool7);
        }
        out.writeString(this.email);
        Boolean bool8 = this.ageRangeNeedsAgreement;
        if (bool8 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool8);
        }
        AgeRange ageRange = this.ageRange;
        if (ageRange == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(ageRange.name());
        }
        Boolean bool9 = this.birthyearNeedsAgreement;
        if (bool9 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool9);
        }
        out.writeString(this.birthyear);
        Boolean bool10 = this.birthdayNeedsAgreement;
        if (bool10 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool10);
        }
        out.writeString(this.birthday);
        BirthdayType birthdayType = this.birthdayType;
        if (birthdayType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(birthdayType.name());
        }
        Boolean bool11 = this.genderNeedsAgreement;
        if (bool11 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool11);
        }
        Gender gender = this.gender;
        if (gender == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(gender.name());
        }
        Boolean bool12 = this.ciNeedsAgreement;
        if (bool12 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool12);
        }
        out.writeString(this.ci);
        out.writeSerializable(this.ciAuthenticatedAt);
        Boolean bool13 = this.legalNameNeedsAgreement;
        if (bool13 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool13);
        }
        out.writeString(this.legalName);
        Boolean bool14 = this.legalBirthDateNeedsAgreement;
        if (bool14 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool14);
        }
        out.writeString(this.legalBirthDate);
        Boolean bool15 = this.legalGenderNeedsAgreement;
        if (bool15 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool15);
        }
        Gender gender2 = this.legalGender;
        if (gender2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(gender2.name());
        }
        Boolean bool16 = this.phoneNumberNeedsAgreement;
        if (bool16 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool16);
        }
        out.writeString(this.phoneNumber);
        Boolean bool17 = this.isKoreanNeedsAgreement;
        if (bool17 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool17);
        }
        Boolean bool18 = this.isKorean;
        if (bool18 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool18);
        }
    }

    public Account(Boolean bool, Boolean bool2, Boolean bool3, Profile profile, Boolean bool4, String str, Boolean bool5, Boolean bool6, Boolean bool7, String str2, Boolean bool8, AgeRange ageRange, Boolean bool9, String str3, Boolean bool10, String str4, BirthdayType birthdayType, Boolean bool11, Gender gender, Boolean bool12, String str5, Date date, Boolean bool13, String str6, Boolean bool14, String str7, Boolean bool15, Gender gender2, Boolean bool16, String str8, Boolean bool17, Boolean bool18) {
        this.profileNeedsAgreement = bool;
        this.profileNicknameNeedsAgreement = bool2;
        this.profileImageNeedsAgreement = bool3;
        this.profile = profile;
        this.nameNeedsAgreement = bool4;
        this.name = str;
        this.emailNeedsAgreement = bool5;
        this.isEmailValid = bool6;
        this.isEmailVerified = bool7;
        this.email = str2;
        this.ageRangeNeedsAgreement = bool8;
        this.ageRange = ageRange;
        this.birthyearNeedsAgreement = bool9;
        this.birthyear = str3;
        this.birthdayNeedsAgreement = bool10;
        this.birthday = str4;
        this.birthdayType = birthdayType;
        this.genderNeedsAgreement = bool11;
        this.gender = gender;
        this.ciNeedsAgreement = bool12;
        this.ci = str5;
        this.ciAuthenticatedAt = date;
        this.legalNameNeedsAgreement = bool13;
        this.legalName = str6;
        this.legalBirthDateNeedsAgreement = bool14;
        this.legalBirthDate = str7;
        this.legalGenderNeedsAgreement = bool15;
        this.legalGender = gender2;
        this.phoneNumberNeedsAgreement = bool16;
        this.phoneNumber = str8;
        this.isKoreanNeedsAgreement = bool17;
        this.isKorean = bool18;
    }
}
