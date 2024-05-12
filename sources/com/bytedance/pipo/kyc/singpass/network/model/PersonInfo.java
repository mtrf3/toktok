package com.bytedance.pipo.kyc.singpass.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PersonInfo extends F9E {

    @InterfaceC65349Pkn("AliasName")
    public final String aliasName;

    @InterfaceC65349Pkn("DateOfBirth")
    public final String dateOfBirth;

    @InterfaceC65349Pkn("EmailAddress")
    public final String emailAddress;

    @InterfaceC65349Pkn("CPFEmployerHistory")
    public final Map<String, String> employerHistory;

    @InterfaceC65349Pkn("HanYuPinYinAliasName")
    public final String hanYuPinYinAliasName;

    @InterfaceC65349Pkn("HanYuPinYinName")
    public final String hanYuPinYinName;

    @InterfaceC65349Pkn("MaritalStatus")
    public final int maritalStatus;

    @InterfaceC65349Pkn("MarriedName")
    public final String marriedName;

    @InterfaceC65349Pkn("MobileNumber")
    public final String mobileNumber;

    @InterfaceC65349Pkn("NRICOrFIN")
    public final String nRICOrFIN;

    @InterfaceC65349Pkn("Nationality")
    public final String nationality;

    @InterfaceC65349Pkn("PrincipalName")
    public final String principalName;

    @InterfaceC65349Pkn("RegisteredAddress")
    public final String registeredAddress;

    @InterfaceC65349Pkn("Sex")
    public final String sex;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.principalName, this.aliasName, this.hanYuPinYinName, this.hanYuPinYinAliasName, this.marriedName, this.dateOfBirth, this.nationality, this.registeredAddress, this.nRICOrFIN, this.mobileNumber, this.emailAddress, this.sex, this.employerHistory, Integer.valueOf(this.maritalStatus)};
    }

    public PersonInfo(String principalName, String aliasName, String hanYuPinYinName, String hanYuPinYinAliasName, String marriedName, String dateOfBirth, String nationality, String registeredAddress, String nRICOrFIN, String mobileNumber, String emailAddress, String sex, Map<String, String> employerHistory, int i) {
        o.LJIIIZ(principalName, "principalName");
        o.LJIIIZ(aliasName, "aliasName");
        o.LJIIIZ(hanYuPinYinName, "hanYuPinYinName");
        o.LJIIIZ(hanYuPinYinAliasName, "hanYuPinYinAliasName");
        o.LJIIIZ(marriedName, "marriedName");
        o.LJIIIZ(dateOfBirth, "dateOfBirth");
        o.LJIIIZ(nationality, "nationality");
        o.LJIIIZ(registeredAddress, "registeredAddress");
        o.LJIIIZ(nRICOrFIN, "nRICOrFIN");
        o.LJIIIZ(mobileNumber, "mobileNumber");
        o.LJIIIZ(emailAddress, "emailAddress");
        o.LJIIIZ(sex, "sex");
        o.LJIIIZ(employerHistory, "employerHistory");
        this.principalName = principalName;
        this.aliasName = aliasName;
        this.hanYuPinYinName = hanYuPinYinName;
        this.hanYuPinYinAliasName = hanYuPinYinAliasName;
        this.marriedName = marriedName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.registeredAddress = registeredAddress;
        this.nRICOrFIN = nRICOrFIN;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.sex = sex;
        this.employerHistory = employerHistory;
        this.maritalStatus = i;
    }
}
